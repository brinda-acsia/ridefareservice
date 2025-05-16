package com.ride.share.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ride.share.delegate.RideDelegate;
import com.ride.share.model.RideFareRequest;
import com.ride.share.rideresponse.RideFareResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class RideController {
    @Autowired
    RideDelegate rideDelegate;

    @PostMapping("rides/fare-calculation")
    public ResponseEntity<RideFareResponse> calculateFare(@RequestBody RideFareRequest rideFareRequest) throws JsonProcessingException {
        return ResponseEntity.ok(rideDelegate.calculateFare(rideFareRequest));
    }
}
