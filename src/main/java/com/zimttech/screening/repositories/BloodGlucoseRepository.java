package com.zimttech.screening.repositories;

import com.zimttech.screening.domain.BloodGlucose;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodGlucoseRepository extends JpaRepository<BloodGlucose, Long> {
    BloodGlucose findByPatientNumber(String patientNumber);

    void deleteByPatientNumber(String patientNumber);
}
