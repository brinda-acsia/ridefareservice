package com.ride.share.handler;

import com.ride.share.context.RideContext;
import com.ride.share.model.AppliedFactor;

public class VehicleTypeHandler implements  CalculateHandler{
    private CalculateHandler next;
    @Override
    public void setNext(CalculateHandler next) {
        this.next =next;

    }

    @Override
    public void handle(RideContext rideContext) {
        double multiplier = 1.2;
        if ("PREMIUM".equals(rideContext.vehicleType)) multiplier =1.2;
        else if ("LUXURY".equals(rideContext.vehicleType)) multiplier=1.5 ;

        if(multiplier >1.0){
            double before= rideContext.finalFare;
            rideContext.finalFare*=multiplier;
            double surge = rideContext.finalFare-before;
            rideContext.breakDown.surgeAmount+=surge;
            rideContext.appliedFactors.add(new AppliedFactor("VEHICLE MULTIPLIER", multiplier, null));
        }

    }
}
