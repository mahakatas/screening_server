package com.zimttech.screening.services;

import com.zimttech.screening.model.DecisionSupport;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DecisionSupportServiceImpl  implements DecisionSupportService{

    public String computeDecision(double bloodGlucose, double systolicBP, double diastolicBP, double weight, double height, int age, String gender) {
        String decision = "";
        DecisionSupport decisionSupport = new DecisionSupport(bloodGlucose, systolicBP, diastolicBP, weight, height,  age, gender);

        // Calculate BMI

        String bmiCategory = decisionSupport.getBMICategory();

        // Check if patient is a child or an adult
        boolean isChild = age < 18;

        // Check if patient is male or female
        boolean isMale = gender.equalsIgnoreCase("male");

        // Determine blood glucose category
        String bgCategory = decisionSupport.getBloodGlucoseCategory();

        // Determine blood pressure category
        String bpCategory = decisionSupport.getBPCategory();

        // Determine height category
        String heightCategory = decisionSupport.getHeightCategory();

        // Determine if patient needs diabetes screening
        boolean needsDiabetesScreening = false;
        if ((bgCategory.equals("High") || bgCategory.equals("Very High")) && !isChild) {
            needsDiabetesScreening = true;
        }

        // Determine if patient needs blood pressure medication
        boolean needsBloodPressureMedication = false;
        if ((bpCategory.equals("High") || bpCategory.equals("Very High")) && !isChild) {
            needsBloodPressureMedication = true;
        }

        // Determine if patient needs weight loss counseling
        boolean needsWeightLossCounseling = false;
        if (bmiCategory.equals("Obese") && !isChild) {
            needsWeightLossCounseling = true;
        }

        // Determine if patient needs growth hormone therapy
        boolean needsGrowthHormoneTherapy = false;
        if (isChild && isMale && heightCategory.equals("Short")) {
            needsGrowthHormoneTherapy = true;
        }

        // Create decision string based on the categories and needs
        decision = getDecision(needsDiabetesScreening, needsBloodPressureMedication, needsWeightLossCounseling, needsGrowthHormoneTherapy);

        // Return decision string
        return decision;
    }
    public String getDecision(boolean needsDiabetesScreening, boolean needsBloodPressureMedication, boolean needsWeightLossCounseling, boolean needsGrowthHormoneTherapy){
        String decision = "";
        if (needsDiabetesScreening) {
            decision += "Patient needs diabetes screening. ";
        }
        if (needsBloodPressureMedication) {
            decision += "Patient needs blood pressure medication. ";
        }
        if (needsWeightLossCounseling) {
            decision += "Patient needs weight loss counseling. ";
        }
        if (needsGrowthHormoneTherapy) {
            decision += "Patient needs growth hormone therapy. ";
        }
        if (decision.equals("")) {
            decision = "Patient is healthy and does not need any interventions. ";
        }
        return decision;
    }
}

