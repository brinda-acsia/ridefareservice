package com.ride.share.handler;

import com.ride.share.context.RideContext;

public interface CalculateHandler {
    void setNext(CalculateHandler next);
    void handle(RideContext rideContext);
}
