package com.zimttech.screening.services;

import com.zimttech.screening.domain.BloodGlucose;

public interface BloodGlucoseService {
    Iterable<BloodGlucose> fetchAllBGs();

    Boolean addBloodGlucose(BloodGlucose bloodGlucose);

    Iterable<BloodGlucose> deleteBloodGlucose(String patientNumber);

    Iterable<BloodGlucose> updateBloodGlucose(BloodGlucose bloodGlucose);

    BloodGlucose findBloodGlucose(String patientNumber);
}
