package com.zimttech.screening.services;

import com.zimttech.screening.domain.Weight;

public interface WeightService {
    Iterable<Weight> fetchAllWeights();

    Boolean addWeight(Weight weight);

    Iterable<Weight> deleteWeight(String patientNumber);
    Weight updateWeight(Weight weight);

    Weight findWeight(String patientNumber);
}
