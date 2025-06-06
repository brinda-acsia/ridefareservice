package com.ride.share.handler;

import com.ride.share.context.RideContext;
import com.ride.share.model.AppliedFactor;

public class SurgeHandler implements CalculateHandler{
    private  CalculateHandler next;
    @Override
    public void setNext(CalculateHandler next) {
        this.next = next;
    }

    @Override
    public void handle(RideContext rideContext) {
        double multiplier = 1.0;
        if("PEAK_HOURS".equals(rideContext.timeOfDay)) multiplier=1.5;
        else if ("NIGHT".equals(rideContext.timeOfDay)) multiplier=1.2;
        if(multiplier >1.0){
            double before= rideContext.finalFare;
            rideContext.finalFare*=multiplier;
            double surge = rideContext.finalFare-before;
            rideContext.breakDown.surgeAmount+=surge;
            rideContext.appliedFactors.add(new AppliedFactor("TIME SURGE", multiplier, null));
        }
    }
}
