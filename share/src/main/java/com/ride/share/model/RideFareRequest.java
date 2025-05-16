package com.ride.share.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RideFareRequest {

    public String rideId;
    public double distance;
    public int duration;
    public String timeOfDay;
    public String vehicleType;
    public String passengerLoyaltyTier;

}
