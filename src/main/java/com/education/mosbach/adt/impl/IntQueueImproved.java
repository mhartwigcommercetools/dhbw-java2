package com.education.mosbach.adt.impl;

import com.education.mosbach.adt.api.IntStorage;

import java.util.ArrayList;

public class IntQueueImproved implements IntStorage {

    ArrayList<Integer> elements = new ArrayList<>();

    @Override
    public int pop() {
        return
                elements.remove(0);
    }

    @Override
    public void push(int intElement) {
        elements.add(intElement);
    }

    @Override
    public int peek() {
        return
                elements.get(0);
    }
}
