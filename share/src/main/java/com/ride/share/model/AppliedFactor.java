package com.ride.share.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AppliedFactor {
    public String type;
    public Double multiplier;
    public Double percentage;

//    public AppliedFactor(String type, Double multiplier, Double percentage) {
//        this.type = type;
//        this.multiplier = multiplier;
//        this.percentage = percentage;
//    }
}
