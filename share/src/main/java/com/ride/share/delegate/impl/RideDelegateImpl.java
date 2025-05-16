package com.ride.share.delegate.impl;

import com.ride.share.delegate.RideDelegate;
import com.ride.share.model.RideFareRequest;
import com.ride.share.rideresponse.RideFareResponse;
import com.ride.share.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RideDelegateImpl implements RideDelegate {
    @Autowired
    RideService rideService;

    @Override
    public RideFareResponse calculateFare(RideFareRequest rideFareRequest) {
        return rideService.calculateFare(rideFareRequest);
    }
}
