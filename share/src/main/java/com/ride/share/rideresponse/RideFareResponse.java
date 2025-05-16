package com.ride.share.rideresponse;

import com.ride.share.model.AppliedFactor;
import com.ride.share.model.BreakDown;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class RideFareResponse {

    public String rideId;
    public double baseFare;
    public double finalFare;
    public List<AppliedFactor> appliedFactors;
    public BreakDown breakDown;

    public RideFareResponse(String rideId, double baseFare, double finalFare, List<AppliedFactor> appliedFactors, BreakDown breakDown) {
        this.rideId = rideId;
        this.baseFare = baseFare;
        this.finalFare = finalFare;
        this.appliedFactors = appliedFactors;
        this.breakDown = breakDown;
    }
}
