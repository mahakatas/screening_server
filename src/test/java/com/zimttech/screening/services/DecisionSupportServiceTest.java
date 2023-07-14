package com.zimttech.screening.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecisionSupportServiceImplTest {

    @Test
    public void testComputeDecision() {
        DecisionSupportServiceImpl dss = new DecisionSupportServiceImpl();
        String decision = dss.computeDecision(80, 120, 80, 70, 1.7, 30, "Male");
        assertEquals("Patient is healthy and does not need any interventions. ", decision);
    }

    @Test
    public void testComputeDecisionDiabetesScreening() {
        DecisionSupportServiceImpl dss = new DecisionSupportServiceImpl();
        String decision = dss.computeDecision(130, 120, 80, 70, 1.7, 30, "Male");
        assertEquals("Patient needs diabetes screening. ", decision);
    }

    @Test
    public void testComputeDecisionBloodPressureMedication() {
        DecisionSupportServiceImpl dss = new DecisionSupportServiceImpl();
        String decision = dss.computeDecision(80, 140, 100, 70, 1.7, 30, "Male");
        assertEquals("Patient needs blood pressure medication. ", decision);
    }

    @Test
    public void testComputeDecisionWeightLossCounseling() {
        DecisionSupportServiceImpl dss = new DecisionSupportServiceImpl();
        String decision = dss.computeDecision(80, 120, 80, 100, 1.7, 30, "Male");
        assertEquals("Patient needs weight loss counseling. ", decision);
    }

    @Test
    public void testComputeDecisionGrowthHormoneTherapy() {
        DecisionSupportServiceImpl dss = new DecisionSupportServiceImpl();
        String decision = dss.computeDecision(80, 120, 80, 70, 1.5, 10, "Male");
        assertEquals("Patient needs growth hormone therapy. ", decision);
    }

    @Test
    public void testComputeDecisionMultipleInterventions() {
        DecisionSupportServiceImpl dss = new DecisionSupportServiceImpl();
        String decision = dss.computeDecision(130, 140, 100, 100, 1.5, 30, "Male");
        assertEquals("Patient needs diabetes screening. Patient needs blood pressure medication. Patient needs weight loss counseling. ", decision);
    }
}