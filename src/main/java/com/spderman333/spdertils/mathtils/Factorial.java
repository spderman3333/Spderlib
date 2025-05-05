package com.spderman333.spdertils.mathtils;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("A negative number cannot be factorialized!");
        }

        int result = 1;

        while (n != 0) {
            result *= n;
            n--;
        }

        return result;
    };
}
