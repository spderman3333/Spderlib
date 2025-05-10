package com.spderman333.spderlib.sorting;

import java.util.ArrayList;
import java.util.Collection;

public class BubbleSort {
    public static ArrayList<Number> sort(ArrayList<? extends Number> arrayToSort) {

    ArrayList<Number> proxyArray = new ArrayList(arrayToSort);
    int lengthOfArray = proxyArray.size();
    boolean sortingFinished;

    do {
        sortingFinished = true;

        for (int i = 1; i < lengthOfArray; i++) {
            if (proxyArray.get(i).doubleValue() < proxyArray.get(i - 1).doubleValue()) {
                double proxy_i = proxyArray.get(i).doubleValue();
                double proxy_i_minus_one = proxyArray.get(i-1).doubleValue();


                proxyArray.set(i, proxy_i_minus_one);
                proxyArray.set(i-1, proxy_i); // Watch this break d:3
                sortingFinished = false;
            }
        }
    } while (!sortingFinished);

    return proxyArray;
    }
}
