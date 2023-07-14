package com.zimttech.screening.services;

import com.zimttech.screening.domain.Patient;

public interface PatientService {
    Iterable<Patient> fetchAllPatients() ;

    Boolean addPatient(Patient patient);

    Iterable<Patient> deletePatient(String patient);

    Iterable<Patient> updatePatient(String patientNumber, Patient patient);

    Patient findPatient(String patientNumber);
}
