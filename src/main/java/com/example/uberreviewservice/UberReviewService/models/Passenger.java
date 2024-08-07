package com.example.uberreviewservice.UberReviewService.models;



import lombok.*;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends  BaseModel{
    private String name;



    @OneToMany (mappedBy = "passenger")
    private List<Booking> booking=new ArrayList<>();
}
