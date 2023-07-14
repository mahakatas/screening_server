package com.zimttech.screening.services;

import com.zimttech.screening.domain.BloodGlucose;
import com.zimttech.screening.repositories.BloodGlucoseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BloodGlucoseServiceImpl implements BloodGlucoseService {
    BloodGlucoseRepository bloodGlucoseRepository;
    public Iterable<BloodGlucose> fetchAllBGs(){
        return bloodGlucoseRepository.findAll();
    }

    public Boolean addBloodGlucose(BloodGlucose bloodGlucose){
        bloodGlucoseRepository.save(bloodGlucose);
        return true;
    }

    public Iterable<BloodGlucose> deleteBloodGlucose(String patientNumber){
        bloodGlucoseRepository.deleteByPatientNumber(patientNumber);
        return bloodGlucoseRepository.findAll();
    }

    public BloodGlucose updateBloodGlucose(BloodGlucose bloodGlucose){
        bloodGlucoseRepository.save(bloodGlucose);
        return bloodGlucose;
    }

    public BloodGlucose findBloodGlucose(String patientNumber) {
        return bloodGlucoseRepository.findByPatientNumber(patientNumber);
    }
}
