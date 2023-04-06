package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.IntFinder;

public class LogarithmicSearch implements IntFinder {

    @Override
    public boolean search(int[] sortedInts, int element) {
        return false;
    }

    @Override
    public boolean logsearch(int[] sortedInts, int posleft, int posright, int element) {

        if (posright < posleft) return false;           // Abschnitt ist leer
        if (posright == posleft)                        // Abschnitt hat genau eine Zahl
            return
                    sortedInts[posleft] == element;     // checken wir die Zahl

        int pospivot = (posright + posleft) / 2;
        if (sortedInts[pospivot] == element) return true;
        if (sortedInts[pospivot] > element)
            return
                   logsearch(sortedInts, posleft, pospivot - 1, element);
        return
                    logsearch(sortedInts, pospivot + 1, posright, element);

    }
}
