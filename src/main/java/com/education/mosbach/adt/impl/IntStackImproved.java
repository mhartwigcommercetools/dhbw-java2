package com.education.mosbach.adt.impl;

import com.education.mosbach.adt.api.IntStorage;

import java.util.ArrayList;

public class IntStackImproved implements IntStorage {

    ArrayList<Integer> elements = new ArrayList<>();

    @Override
    public int pop() {
        return
                elements.remove(elements.size()-1);
    }

    @Override
    public void push(int intElement) {
        elements.add(intElement);
    }

    @Override
    public int peek() {
        return
                elements.get(elements.size()-1);
    }
}
