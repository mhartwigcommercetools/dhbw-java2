package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.IntFinder;

public class BruteForceSearch implements IntFinder {

    @Override
    public boolean search(int[] ints, int element) {

        for (int e : ints)
            if (e == element) return true;

        return false;
    }

    @Override
    public boolean logsearch(int[] sortedInts, int posleft, int posright, int element) {
        return false;
    }
}
