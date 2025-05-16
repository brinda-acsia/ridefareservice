package com.ride.share.repository;

import com.ride.share.entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RideRepository extends JpaRepository <Ride, String> {

}
