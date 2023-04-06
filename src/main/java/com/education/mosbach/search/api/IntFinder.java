package com.education.mosbach.search.api;

public interface IntFinder {

    boolean search(int[] ints, int element);
    boolean logsearch(int[] sortedInts, int posleft, int posright, int element);

}
