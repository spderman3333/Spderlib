package com.spderman333.spderlib.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void testSort() {
        Double[] testArray = {5.0,20.0,1.0,220.0,102.0,2.0};
        ArrayList<Double> testArrayList = new ArrayList<>(Arrays.asList(testArray));

        Double[] sortedArray = {1.0,2.0,5.0,20.0,102.0,220.0};
        ArrayList<Double> presortedArrayList = new ArrayList<>(Arrays.asList(sortedArray));

        assertEquals(presortedArrayList, BubbleSort.sort(testArrayList));
    }
}
