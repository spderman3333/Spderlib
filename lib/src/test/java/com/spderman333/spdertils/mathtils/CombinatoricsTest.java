package com.spderman333.spdertils.mathtils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class CombinatoricsTest {

    @Test
    public void testFactorial() {
        assertEquals(720, Combinatorics.factorial(6));
        assertEquals(1, Combinatorics.factorial(0));

        assertThrowsExactly(IllegalArgumentException.class, () -> Combinatorics.factorial(-1));
    }

    @Test
    public void testPermutation() {
        assertEquals(120, Combinatorics.permutation(6, 3));
        assertEquals(1, Combinatorics.permutation(0, 0));

        assertThrowsExactly(IllegalArgumentException.class, () -> Combinatorics.permutation(-1, -1));
    }

    @Test
    public void testCombination() {
        assertEquals(20, Combinatorics.combination(6,3));
        assertEquals(1, Combinatorics.combination(0, 0));

        assertThrowsExactly(IllegalArgumentException.class, () -> Combinatorics.combination(-1, -1));
    }
}
