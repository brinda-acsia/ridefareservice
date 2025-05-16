package com.ride.share.handler;

import com.ride.share.context.RideContext;
import com.ride.share.model.AppliedFactor;

public class LoyalityDiscounts implements CalculateHandler{
    private  CalculateHandler next;
    @Override
    public void setNext(CalculateHandler next) {
        this.next = next;
    }

    @Override
    public void handle(RideContext rideContext) {
        double percentage = 0;
       switch (rideContext.passengerLoyaltyTier){
           case "SILVER" : percentage =5;break;
           case "GOLD" : percentage = 10;break;
           case "PLATINUM" : percentage = 15;break;
       }
       if (percentage>0){

           double discount = rideContext.finalFare*percentage*100;
           rideContext.finalFare-=discount;
           rideContext.breakDown.loyaltyDiscount=discount;
           rideContext.appliedFactors.add(new AppliedFactor("TIME SURGE", percentage, null));
       }
    }
}
