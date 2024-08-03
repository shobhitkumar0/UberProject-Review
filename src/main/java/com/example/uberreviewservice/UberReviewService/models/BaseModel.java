package com.example.uberreviewservice.UberReviewService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseModel {

    @Id//this annotation make the id property as primary key of our table;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(nullable = false)//this annotation helps in creating of table with Non-Null Values;
    @Temporal(TemporalType.TIMESTAMP)  //this helps in having timestamp as value in it .
    @CreatedDate        //this helps to only change value or handle when creation happens
    protected Date createdAt;

    @Column(nullable = false)//this annotation helps in creating of table with Non-Null Values;
    @Temporal(TemporalType.TIMESTAMP)//this helps in having timestamp as value in it .
    @LastModifiedDate //this helps to only change value or handle when modification  happens
    protected Date updatedAt;

}
