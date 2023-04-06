package com.education.mosbach.sort.impl;

import com.education.mosbach.sort.api.IntSorter;

public class BubbleSortImproved implements IntSorter {

    public void swap(int[] ints, int position1, int position2) {
        int temp = ints[position1];
        ints[position1] = ints[position2];
        ints[position2] = temp;
    }

    public int[] sort(int[] ints) {
        boolean swapped = false;
        for (int j = 0; j < ints.length - 1; j++) {
            swapped = false;
            for (int i = 0; i < ints.length - 1 - j; i++)  // ich gehe nicht immer bis ans Ende
                if (ints[i] > ints[i+1]) {                  // wenn kein swap, dann Schluss
                    swapped = true;
                    swap(ints, i, i+1);
                }
            if (!swapped)
                    return ints;
        }
        return ints;
    }

    public static void main(String[] args) {
        IntSorter bubbleSort = new BubbleSortImproved();
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
