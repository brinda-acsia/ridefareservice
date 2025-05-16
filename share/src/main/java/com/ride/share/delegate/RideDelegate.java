package com.ride.share.delegate;

import com.ride.share.model.RideFareRequest;
import com.ride.share.rideresponse.RideFareResponse;
import org.springframework.stereotype.Component;

@Component
public interface RideDelegate {
    public RideFareResponse calculateFare(RideFareRequest rideFareRequest);
}
