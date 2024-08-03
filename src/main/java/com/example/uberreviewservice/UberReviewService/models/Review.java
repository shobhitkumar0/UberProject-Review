package com.example.uberreviewservice.UberReviewService.models;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name="bookingreview")
public class Review extends  BaseModel{

    @Column(nullable = false)
    private String content;

    private Double rating;

    @Override
    public String toString(){
        return "Reviews:"+this.content+" "+this.rating+" "+this.createdAt;}



}
