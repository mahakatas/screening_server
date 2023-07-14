package com.zimttech.screening.services;

import com.zimttech.screening.domain.Patient;

public interface PatientService {
    default Iterable<Patient> fetchAllPatients() {
        return null;
    }
}
