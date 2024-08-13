package com.example.uberreviewservice.UberReviewService.services;

import com.example.uberreviewservice.UberReviewService.models.Booking;
import com.example.uberreviewservice.UberReviewService.models.Driver;
import com.example.uberreviewservice.UberReviewService.models.Review;
import com.example.uberreviewservice.UberReviewService.repositories.BookingRepository;
import com.example.uberreviewservice.UberReviewService.repositories.DriverRepository;
import com.example.uberreviewservice.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {
    private ReviewRepository reviewRepository;
    private final DriverRepository driverRepository;
    private final BookingRepository bookingRepository;


    public ReviewService (ReviewRepository reviewRepository,DriverRepository driverRepository,
    BookingRepository bookingRepository
    ){
        this.reviewRepository=reviewRepository;
        this.driverRepository=driverRepository;
        this.bookingRepository=bookingRepository;
    }
    @Override
    public void run(String...args)throws   Exception{
//        Review r=Review.builder().content("Amazing ride quality 2").rating(5.0).build();
//        reviewRepository.save(r);
//        List<Review> reviews=reviewRepository.findAll();
//        for(Review review:reviews){
//            System.out.println(review.getContent());
////        }
//        List<Driver> drivers=driverRepository.findAll();
//        Optional<Driver> driver=driverRepository.findByIdAndLicenseNumber(1L,"BR02S0247");
//        if(driver.isPresent()){
//            System.out.println(driver.get().getName());
//            List<Booking> bookings= bookingRepository.findAllByDriverId(1L);
//            for(Booking booking:bookings){
//                System.out.println("\\\\\\\\\\\\\\\\\\\\\\");
//                System.out.println(booking.getBookingStatus());
//            }
//        }

//        Optional<Driver> d=driverRepository.rawFindByIdAndLicenseNumber(1L,"BR02S0247");
//        System.out.println(d.get().getName());
        Optional<Driver> e=driverRepository.hqlFindByIdAndLicenseNumber(1L,"BR02S0247");
        System.out.println(e.get().getName());
    }
}
