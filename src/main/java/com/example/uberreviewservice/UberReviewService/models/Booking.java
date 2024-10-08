package com.example.uberreviewservice.UberReviewService.models;

import com.example.uberreviewservice.UberReviewService.models.BookingStatus.BookingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel {
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Review review;
    @Enumerated(value= EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value= TemporalType.DATE)
    private Date startTime;

    @Temporal(value= TemporalType.DATE)

    private Date endTime;
    private long totalDistance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;

}
