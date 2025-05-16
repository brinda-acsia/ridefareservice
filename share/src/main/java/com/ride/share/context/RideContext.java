package com.ride.share.context;

import com.ride.share.model.AppliedFactor;
import com.ride.share.model.BreakDown;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RideContext {

    public double distance;
    public int duration;
    public String timeOfDay;
    public String vehicleType;
    public String passengerLoyaltyTier;
    public double baseFare=0;
    public double finalFare=0;
    public List<AppliedFactor> appliedFactors= new ArrayList<>();
    public BreakDown breakDown= new BreakDown();


}
