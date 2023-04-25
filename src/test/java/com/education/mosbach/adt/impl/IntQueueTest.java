package com.education.mosbach.adt.impl;

import com.education.mosbach.adt.api.IntStorage;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class IntQueueTest {

    private IntStorage myStorage;

    @Before
    public void before() {
        myStorage = new IntQueueImproved();
    }

    @After
    public void after() {
        myStorage = null;
    }

    @Test
    @Parameters({
            "1-5-4              ,   push            , 5         , 1",
            "1-5-4              ,   peek            , 0         , 1",
            "15-20-30           ,   pop             , 0         , 20",
            "1-2-3-4-5-6        ,   pop             , 0         , 2"
    })
    public void testLogSearch(String stack, String operation, int element, int head) {

        int[] stackArray =
                Arrays.stream(stack.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();

        for (int e : stackArray) {
            myStorage.push(e);
        }

        if (operation.equals("push")) myStorage.push(element);
        if (operation.equals("peek")) myStorage.peek();
        if (operation.equals("pop")) myStorage.pop();

        assertEquals(
                head,
                myStorage.peek()
        );
    }








}
