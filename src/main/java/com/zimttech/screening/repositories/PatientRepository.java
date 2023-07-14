package com.zimttech.screening.repositories;

import com.zimttech.screening.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByNumber(String patientNumber);
}
