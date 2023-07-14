package com.zimttech.screening.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecisionSupportTests {

    @Test
    public void testBloodGlucoseCategory() {
        DecisionSupport ds = new DecisionSupport(80, 120, 80, 70, 1.7, 30, "Male");
        assertEquals("High", ds.getBloodGlucoseCategory());
    }

    @Test
    public void testBPCategory() {
        DecisionSupport ds = new DecisionSupport(80, 120, 80, 70, 1.7, 30, "Male");
        assertEquals("Normal", ds.getBPCategory());
    }

    @Test
    public void testBMICategory() {
        DecisionSupport ds = new DecisionSupport(80, 120, 80, 70, 1.7, 30, "Male");
        assertEquals("Normal", ds.getBMICategory());
    }

    @Test
    public void testHeightCategory() {
        DecisionSupport ds = new DecisionSupport(80, 120, 80, 70, 1.7, 30, "Male");
        assertEquals("Normal", ds.getHeightCategory());
    }
}