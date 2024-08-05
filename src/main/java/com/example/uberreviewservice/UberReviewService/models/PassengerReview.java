package com.example.uberreviewservice.UberReviewService.models;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassengerReview extends Review {
    private String passengerReviewContent;
    private String passengerRating;

}
