package com.zimttech.screening.repositories;

import com.zimttech.screening.domain.Weight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeightRepository extends JpaRepository<Weight, Long> {
    Weight findByPatientNumber(String patientNumber);
}
