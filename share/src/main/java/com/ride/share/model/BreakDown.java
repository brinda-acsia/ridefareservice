package com.ride.share.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BreakDown {

    public double distanceCharge;
    public double durationCharge;
    public double surgeAmount;
    public double loyaltyDiscount;

}
