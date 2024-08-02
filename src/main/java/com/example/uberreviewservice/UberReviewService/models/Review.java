package com.example.uberreviewservice.UberReviewService.models;

import java.util.Date;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Data;
@Entity
@Table(name="bookingreview")
public class Review {
    @Id//this annotation make the id property as primary key of our table;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String content;

    Double rating;

    @Column(nullable = false)//this annotation helps in creating of table with Non-Null Values;
    @Temporal(TemporalType.TIMESTAMP)  //this helps in having timestamp as value in it .
    @CreatedDate        //this helps to only change value or handle when creation happens
    private Date createdAt;

    @Column(nullable = false)//this annotation helps in creating of table with Non-Null Values;
    @Temporal(TemporalType.TIMESTAMP)//this helps in having timestamp as value in it .
    @LastModifiedDate //this helps to only change value or handle when modification  happens
    private Date updatedAt;


}
