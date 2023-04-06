package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.IntFinder;
import com.education.mosbach.sort.api.IntSorter;
import com.education.mosbach.sort.impl.QuickSort;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BruteForceSearchTest {

    private IntFinder myFinder;

    @Before
    public void before() {
        myFinder = new BruteForceSearch();
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
            "7-9-14-4-4-8       ,   9               , true",
            "21-20-19-18-17     ,   88              , false"
    })
    public void testSearch(String unSorted, int element, boolean found) {

        int[] unSortedArray =
                Arrays.stream(unSorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        assertEquals(
                found,
                myFinder.search(unSortedArray, element)
        );
    }








}
