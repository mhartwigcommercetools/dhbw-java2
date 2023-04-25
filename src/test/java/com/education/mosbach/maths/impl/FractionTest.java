package com.education.mosbach.maths.impl;

import com.education.mosbach.maths.api.Fraction;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FractionTest {

    private Fraction fraction;

    @Before
    public void before() {
        fraction = new FractionImpl(1,1);
    }

    @After
    public void after() {
        fraction = null;
    }

    @Test
    @Parameters({
            "15                 ,   30              , 1         , 2",
            "154                ,   27              , 154       , 27",
            "155                ,   5               , 31        , 1",
            "100                ,   1000            , 1         , 10"
    })
    public void testSimplify(int nominatorBefore,
                             int denominatorBefore,
                             int nominatorAfter,
                             int denominatorAfter) {

        fraction.setNominator(nominatorBefore);
        fraction.setDenominator(denominatorBefore);
        fraction.simplify();

        assertEquals(
                nominatorAfter,
                fraction.getNominator()
        );
        assertEquals(
                denominatorAfter,
                fraction.getDenominator()
        );
    }








}
