package com.zimttech.screening.services;

import com.zimttech.screening.domain.Patient;
import com.zimttech.screening.repositories.PatientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class PatientServiceTest {
    @Mock
    private PatientRepository patientRepository;

    @InjectMocks
    private PatientServiceImpl patientService;

    @Test
    public void testAddPatient() {
        Patient patient = new Patient();
        when(patientRepository.save(any())).thenReturn(patient);

        Boolean result = patientService.addPatient(patient);

        assertTrue(result);
        verify(patientRepository, times(1)).save(any());
    }

    @Test
    public void testFindPatient() {
        Patient patient = new Patient();

    }

    @Test
    public void testUpdatePatient() {

    }

    @Test
    public void testDeletePatient() {

    }

    @Test
    public void testFetchAllPatients() {
        patientService.fetchAllPatients();

        verify(patientRepository, times(1)).findAll();
    }

    @Test
    public void testGetPatientDecision() {

    }

}