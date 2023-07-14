package com.zimttech.screening.services;

import com.zimttech.screening.domain.*;
import com.zimttech.screening.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    PatientRepository patientRepository;
    DecisionSupportService decisionSupportService;
    BloodGlucoseRepository bloodGlucoseRepository;
    BloodPressureRepository bloodPressureRepository;
    WeightRepository weightRepository;
    HeightRepository heightRepository;

    public Iterable<Patient> fetchAllPatients(){
        return patientRepository.findAll();
    }

    public Boolean addPatient(Patient patient) {
        patientRepository.save(patient);
        return true;
    }

    public Iterable<Patient> deletePatient(String patientNumber) {
        Patient patient =  patientRepository.findByPatientNumber(patientNumber);
        patientRepository.delete(patient);
        return patientRepository.findAll();
    }

    public Boolean updatePatient(String patientNumber, Patient patient) {
        patientRepository.save(patient);
        return true;
    }

    public Patient findPatient(String patientNumber){

        return  patientRepository.findByPatientNumber(patientNumber);
    }

    public String getPatientDecision(String patientNumber){
        Patient patient =  patientRepository.findByPatientNumber(patientNumber);
        if (patient != null) {
            BloodPressure bp = bloodPressureRepository.findByPatientNumber(patientNumber);
            BloodGlucose bloodGlucose = bloodGlucoseRepository.findByPatientNumber(patientNumber);
            Weight pWeight = weightRepository.findByPatientNumber(patientNumber);
            Height pHeight = heightRepository.findByPatientNumber(patientNumber);

            double systolicBP = bp!=null?bp.getSystolic():0;
            double diastolicBP = bp!=null?bp.getDiastolic():0;
            double weight = pWeight!=null?pWeight.getValueInKg():0;
            double height = pHeight!=null?pHeight.getValueInCm():0;
            int age = Period.between(patient.getDateOfBirth(), bp.getDateCreated().toLocalDate()).getYears();


            return decisionSupportService.computeDecision(bloodGlucose.getMolarConcentration(), systolicBP, diastolicBP, weight, height, age, patient.getGender());
        }
        return "";
    }
}
