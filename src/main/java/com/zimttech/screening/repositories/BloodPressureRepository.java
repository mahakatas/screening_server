package com.zimttech.screening.repositories;

import com.zimttech.screening.domain.BloodPressure;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BloodPressureRepository extends JpaRepository<BloodPressure, Long> {
}
