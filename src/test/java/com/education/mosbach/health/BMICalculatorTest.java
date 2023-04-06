package com.education.mosbach.health;

import com.education.mosbach.utils.ClassPrep;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BMICalculatorTest {

    private BMICalculator bmiCalculator;

    @Before
    public void before() {
        bmiCalculator = new BMICalculator();
    }

    @After
    public void after() {
        bmiCalculator = null;
    }

    @Test
    @Parameters({
            "95                 ,   194                     ,   25",
            "70                 ,   177                     ,   22",
            "58                 ,   180                     ,   17",
            "99                 ,   155                     ,   41"
    })
    public void testCalculateBMI(int weight, int height, int bmi) {
        assertEquals(
                bmi,
                bmiCalculator.bmiCalculate(weight, height)
        );
    }

    @Test
    @Parameters({
            "70                 ,   195                     ,   Please eat more hamburgers",
            "100                ,   195                     ,   Please go to the gym",
            "70                 ,   185                     ,   You are fine",
            "84                 ,   183                     ,   You are fine"
    })
    public void testCalculateBMI(int weight, int height, String bmiRecommendation) {
        assertEquals(
                bmiRecommendation,
                bmiCalculator.getBMIRecommendation(weight, height)
        );
    }





}
