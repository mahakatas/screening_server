package com.zimttech.screening.repositories;

import com.zimttech.screening.domain.Height;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeightRepository extends JpaRepository<Height, Long> {

    Height findByPatientNumber(String patientNumber);
}
