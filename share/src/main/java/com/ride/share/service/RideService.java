package com.ride.share.service;

import com.ride.share.model.RideFareRequest;
import com.ride.share.rideresponse.RideFareResponse;
import org.springframework.stereotype.Service;

@Service
public interface RideService {
    public RideFareResponse calculateFare(RideFareRequest rideFareRequest);
}
