package com.example.uberreviewservice.UberReviewService.repositories;

import com.example.uberreviewservice.UberReviewService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
}
