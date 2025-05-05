package com.spderman333.spdertils.mathtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals( 720, Factorial.factorial(6));
    }
}
