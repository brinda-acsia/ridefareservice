package com.ride.share.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ride")

public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public String rideId;
    @Column(name = "basefare")
    public double baseFare;
    @Column(name = "finalfare")
     public double finalFare;
    @Lob
    @Column(name="breakDown")
    public String breakDown;

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public double getFinalFare() {
        return finalFare;
    }

    public void setFinalFare(double finalFare) {
        this.finalFare = finalFare;
    }

    public String getBreakDown() {
        return breakDown;
    }

    public void setBreakDown(String breakDown) {
        this.breakDown = breakDown;
    }
}
