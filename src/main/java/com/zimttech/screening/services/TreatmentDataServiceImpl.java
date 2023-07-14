package com.zimttech.screening.services;

import com.zimttech.screening.domain.BloodGlucose;
import com.zimttech.screening.domain.TreatmentData;
import com.zimttech.screening.repositories.TreatmentDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TreatmentDataServiceImpl  implements TreatmentDataService{

    TreatmentDataRepository treatmentDataRepository;
    public Iterable<TreatmentData> fetchAllTreatments(){
        return treatmentDataRepository.findAll();
    }

    public Boolean addTreatmentData(TreatmentData treatmentData){
        treatmentDataRepository.save(treatmentData);
        return true;
    }

    public Iterable<TreatmentData> deleteTreatmentData(String patientNumber){
        treatmentDataRepository.deleteByPatientNumber(patientNumber);
        return treatmentDataRepository.findAll();
    }

    public TreatmentData updateTreatmentData(TreatmentData treatmentData){
        treatmentDataRepository.save(treatmentData);
        return treatmentData;
    }

    public TreatmentData findTreatmentData(String patientNumber) {
        return treatmentDataRepository.findByPatientNumber(patientNumber);
    }
}
