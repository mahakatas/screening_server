package com.zimttech.screening.services;

import com.zimttech.screening.domain.BloodGlucose;
import com.zimttech.screening.repositories.BloodGlucoseRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class BloodGlucoseServiceTests  {
    @Mock
    private BloodGlucoseRepository bloodGlucoseRepository;

    @InjectMocks
    private BloodGlucoseServiceImpl bloodGlucoseService;

    @Test
    public void testAddBloodGlucose() {

    }

    @Test
    public void testFindBloodGlucose() {

    }

    @Test
    public void testUpdateBloodGlucose() {

    }

    @Test
    public void testDeleteBloodGlucose() {

    }

    @Test
    public void testFetchAllBGs() {

    }
}
