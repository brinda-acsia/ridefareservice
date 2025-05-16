package com.ride.share.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ride.share.context.RideContext;
import com.ride.share.entity.Ride;
import com.ride.share.handler.*;
import com.ride.share.model.RideFareRequest;
import com.ride.share.repository.RideRepository;
import com.ride.share.rideresponse.RideFareResponse;
import com.ride.share.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonProperties;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Autowired
    RideRepository rideRepository;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public RideFareResponse calculateFare(RideFareRequest rideFareRequest) {
        RideContext rideContext= new RideContext();
        CalculateHandler base = new RideHandler();
        CalculateHandler surge = new SurgeHandler();
        CalculateHandler vehicle = new VehicleTypeHandler();
        CalculateHandler loyality = new LoyalityDiscounts();

        base.setNext(base);
        surge.setNext(surge);
        vehicle.setNext(vehicle);
        loyality.setNext(loyality);

        Ride ride = new Ride();
        ride.setRideId(rideFareRequest.rideId);
        ride.setBaseFare(rideContext.baseFare);
        ride.setFinalFare(rideContext.finalFare);

        rideRepository.saveAndFlush(ride);

        return new RideFareResponse(
                rideFareRequest.rideId,
                round( rideContext.baseFare),
                round( rideContext.finalFare),
                rideContext.appliedFactors,
                rideContext.breakDown
        );


    }
    private double round(double value){
        return Math.round(value*100.0)/100.0;
    }
}
