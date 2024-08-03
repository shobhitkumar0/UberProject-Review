package com.example.uberreviewservice.UberReviewService.services;

import com.example.uberreviewservice.UberReviewService.models.Review;
import com.example.uberreviewservice.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    private ReviewRepository reviewRepository;

    public ReviewService (ReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;
    }
    @Override
    public void run(String...args)throws   Exception{
        Review r=Review.builder().content("Amazing ride quality 2").rating(5.0).build();
        reviewRepository.save(r);
        List<Review> reviews=reviewRepository.findAll();
        for(Review review:reviews){
            System.out.println(review.getContent());
        }
    }
}
