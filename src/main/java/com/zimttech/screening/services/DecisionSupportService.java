package com.zimttech.screening.services;

import com.zimttech.screening.model.DecisionSupport;

public interface DecisionSupportService {

    public String computeDecision(double bloodGlucose, double systolicBP, double diastolicBP, double weight, double height, int age, String gender);
    String getDecision(boolean needsDiabetesScreening, boolean needsBloodPressureMedication, boolean needsWeightLossCounseling, boolean needsGrowthHormoneTherapy);
}
