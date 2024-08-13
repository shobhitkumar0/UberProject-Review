package com.example.uberreviewservice.UberReviewService.repositories;

import com.example.uberreviewservice.UberReviewService.models.Booking;
import com.example.uberreviewservice.UberReviewService.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DriverRepository  extends JpaRepository<Driver,Long> {
      Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);


      @Query(nativeQuery=true,value="SELECT * FROM Driver  id=:id AND license_number=:license")
      Optional<Driver> rawFindByIdAndLicenseNumber(Long id, String license);

      @Query("SELECT d FROM Driver as d where d.id=:id AND d.licenseNumber=:li")
      Optional<Driver> hqlFindByIdAndLicenseNumber(Long id, String li);

}
