package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.IntFinder;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class LogarithmicSearchTest {

    private IntFinder myFinder;

    @Before
    public void before() {
        myFinder = new LogarithmicSearch();
    }

    @After
    public void after() {
        myFinder = null;
    }

    @Test
    @Parameters({
            "1                  ,   1               , true",
            "1                  ,   7               , false",
            "15-20-30           ,   30              , true",
            "7-7-7-7-7-7        ,   7               , true",
            "7-7-7-7-7-7        ,   9               , false",
            "7-9-14-15-24-28    ,   9               , true",
            "17-18-19-20-21     ,   88              , false"
    })
    public void testLogSearch(String sorted, int element, boolean found) {

        int[] sortedArray =
                Arrays.stream(sorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        assertEquals(
                found,
                myFinder.logsearch(sortedArray, 0, sortedArray.length-1, element)
        );
    }








}
