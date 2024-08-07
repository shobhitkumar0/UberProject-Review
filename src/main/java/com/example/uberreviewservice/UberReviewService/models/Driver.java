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
public class Driver extends  BaseModel{
    private String name;

    @Column(nullable = false,unique = true)
    private String licenseNumber;

    @OneToMany (mappedBy = "driver")
    private List<Booking> booking=new ArrayList<>();
}
