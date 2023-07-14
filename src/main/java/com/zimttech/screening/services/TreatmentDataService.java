package com.zimttech.screening.services;

import com.zimttech.screening.domain.TreatmentData;

public interface TreatmentDataService {
    Iterable<TreatmentData> deleteTreatmentData(String patientNumber) ;

    Iterable<TreatmentData> fetchAllTreatments();

    Boolean addTreatmentData(TreatmentData treatmentData);

    Iterable<TreatmentData> updateTreatmentData(TreatmentData treatmentData);

    TreatmentData findTreatmentData(String patientNumber);
}
