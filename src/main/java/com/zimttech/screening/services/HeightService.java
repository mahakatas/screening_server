package com.zimttech.screening.services;

import com.zimttech.screening.domain.Height;

public interface HeightService {
    Iterable<Height> fetchAllHeights();

    Height findHeight(String patientNumber);

    Height updateHeight(Height height);

    Iterable<Height> deleteHeight(String patientNumber);

    Boolean addHeight(Height height);
}
