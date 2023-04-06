package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntSorter;

public class BubbleSort implements IntSorter {

    public void swap(int[] ints, int position1, int position2) {
        int temp = ints[position1];
        ints[position1] = ints[position2];
        ints[position2] = temp;
    }

    public int[] sort(int[] ints) {
        for (int j = 0; j < ints.length - 1; j++)
            for (int i = 0; i < ints.length - 1; i++)
                if (ints[i] > ints[i+1]) {
                    swap(ints, i, i+1);
                }
        return ints;
    }

    public static void main(String[] args) {
        IntSorter bubbleSort = new BubbleSort();
        int[] A = {7, 2, 6, 5, 1};

        System.out.println("Before sorting ");
        for (int e : A) System.out.print(e + " ");
        System.out.println("");

        bubbleSort.sort(A);

        System.out.println("After sorting ");
        for (int e : A) System.out.print(e + " ");
        System.out.println("");


    }


}
