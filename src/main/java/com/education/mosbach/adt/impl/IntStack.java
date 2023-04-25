package com.education.mosbach.adt.impl;

import com.education.mosbach.adt.api.IntStorage;

public class IntStack implements IntStorage {

    int[] elements = new int[5];
    int topOfStack = -1;

    @Override
    public int pop() {
        int element = elements[topOfStack];
        topOfStack--;
        return
                element;
    }

    @Override
    public void push(int intElement) {
        topOfStack++;
        elements[topOfStack] = intElement;
    }

    @Override
    public int peek() {
        return
                elements[topOfStack];
    }
}
