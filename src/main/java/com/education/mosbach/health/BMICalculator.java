package com.education.mosbach.health;

public class BMICalculator {

    public BMICalculator() {
    }

    public int bmiCalculate(int weightInKG, int heightInCM) {

        return
                10_000 * weightInKG / (heightInCM * heightInCM);

    }

    public String getBMIRecommendation(int weightInKG, int heightInCM) {

        if (bmiCalculate(weightInKG, heightInCM) < 19)
                return "Please eat more hamburgers";
        if (bmiCalculate(weightInKG, heightInCM) > 25)
                return "Please go to the gym";
        return
                "You are fine";

    }


}
