package com.ride.share.handler;

import com.ride.share.context.RideContext;

public class RideHandler implements CalculateHandler{

private  CalculateHandler next;
    @Override
    public void setNext(CalculateHandler next) {
this.next = next;
    }

    @Override
    public void handle(RideContext rideContext) {
        double distance = rideContext.distance*1.5;
        double duration = rideContext.duration*1.5;
        rideContext.baseFare=distance+duration;
        rideContext.finalFare=rideContext.baseFare;
        rideContext.breakDown.distanceCharge=distance;
        rideContext.breakDown.durationCharge=duration;

    }
}
