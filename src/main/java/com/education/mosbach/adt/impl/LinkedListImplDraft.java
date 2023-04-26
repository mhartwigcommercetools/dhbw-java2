package com.education.mosbach.adt.impl;

import com.education.mosbach.adt.api.LinkedList;

public class LinkedListImplDraft implements LinkedList {

    IntegerNode root = null;

    @Override
    public void add(Object o) {
        // Liste bisher leer
        if (root == null) {
            IntegerNode t = new IntegerNode();
            t.content = (Integer) o;
            t.next = null;
            root = t;
        }

        // Liste hat schon Elemente
        // t = root;
        // while t.next != null
        //        t = t.next
        // anhängen

    }

    @Override
    public Object remove(Object o) {
        // t = root;
        // while t.content != o
        //        t = t.next
        // t.next = t.next.next
        return null;
    }

    @Override
    public Object find(Object o) {
        // t = root;
        // while t.content != o
        //        t = t.next
        // return t
        return null;
    }
}
