package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntSorter;

import java.util.ArrayList;

public class QuickSort implements IntSorter {

    public QuickSort() {
    }

    public ArrayList<Integer> qsort(ArrayList<Integer> integers) {

        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();

        if(integers.size() < 2) return integers;
        Integer pivot = integers.get(0);

        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) <= pivot)
                    smaller.add(integers.get(i));
                else
                    larger.add(integers.get(i));
        }

        sorted.addAll(qsort(smaller));
        sorted.add(pivot);
        sorted.addAll(qsort(larger));

        return
                sorted;
    }

    public int[] sort(int[] ints) {

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i : ints) integers.add(i);

        ArrayList<Integer> integersSorted = qsort(integers);

        int[] intsSorted = new int[integersSorted.size()];
        for (int i = 0; i < integersSorted.size(); i++)
            intsSorted[i] = integersSorted.get(i);

        return intsSorted;
    }



    public static void main(String[] args) {

        ArrayList<Integer> myUnsortedList = new ArrayList<>();
        myUnsortedList.add(12);
        myUnsortedList.add(4);
        myUnsortedList.add(6);
        myUnsortedList.add(12);
        myUnsortedList.add(9);

        QuickSort quickSort = new QuickSort();
        ArrayList<Integer> mySortedList = quickSort.qsort(myUnsortedList);

        System.out.println("Before sorting");
        myUnsortedList.forEach(System.out::println);

        System.out.println("After sorting");
        mySortedList.forEach(System.out::println);

    }


}
