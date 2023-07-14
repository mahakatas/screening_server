package com.zimttech.screening.services;

import com.zimttech.screening.domain.BloodPressure;
import com.zimttech.screening.repositories.BloodPressureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BloodPressureServiceImpl implements  BloodPressureService{
    BloodPressureRepository bloodPressureRepository;
    public Iterable<BloodPressure> fetchAllBPs(){
        return bloodPressureRepository.findAll();
    }

    public Boolean addBloodPressure(BloodPressure bloodPressure){
        bloodPressureRepository.save(bloodPressure);
        return true;
    }

    public Iterable<BloodPressure> deleteBloodPressure(String patientNumber){
        bloodPressureRepository.deleteByPatientNumber(patientNumber);
        return bloodPressureRepository.findAll();
    }

    public BloodPressure updateBloodPressure(BloodPressure bloodPressure){
        bloodPressureRepository.save(bloodPressure);
        return bloodPressure;
    }

    public BloodPressure findBloodPressure(String patientNumber) {
        return bloodPressureRepository.findByPatientNumber(patientNumber);
    }
}
