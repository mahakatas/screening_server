package com.zimttech.screening.services;

import com.zimttech.screening.domain.BloodPressure;

public interface BloodPressureService {
    Iterable<BloodPressure> fetchAllBPs();

    Boolean addBloodPressure(BloodPressure bloodPressure);

    Iterable<BloodPressure> deleteBloodPressure(String patientNumber);

    Iterable<BloodPressure> updateBloodPressure(BloodPressure bloodPressure);

    BloodPressure findBloodPressure(String patientNumber);
}
