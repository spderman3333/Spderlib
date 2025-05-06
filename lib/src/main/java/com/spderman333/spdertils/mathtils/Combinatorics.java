package com.spderman333.spdertils.mathtils;

/**
 * The Combinatorics Class mainly offers methods that deal with factorials, permutations, and combinations.
 * <p>Do note, that all of the functions will fail if a negative number, or a float is passed.</p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/Combinatorics">en.wikipedia.org/wiki/Combinatorics</a>
 *
 * @author Spderman333
 */


public class Combinatorics {

    //TODO: Add names to the params in javadocs

    /**
     * Uses the following formula:
     * <p><code>n!</code></p>
     *
     * @param n
     * @return The factorial of <code>n</code>.
     *
     * @throws IllegalArgumentException If a negative number is passed.
     */
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
    }

    /**
     * Uses the following formula:
     *
     * <p><code>(n!)/(n-r)!</code></p>
     *
     * @param n
     * @param r
     * @return The permutation of <code>n</code> and <code>r</code>.
     *
     * @throws IllegalArgumentException If a negative number is passed.
     */
    public static int permutation(int n, int r) {
        int result;

        if (n >= 0 && r >= 0) {
            result = factorial(n)/factorial(n-r);
            return result;
        } else {
            throw new IllegalArgumentException("A negative number cannot be permuted!");
        }
    }

    /**
     * Uses the following formula:
     *
     * <p><code>(n!)/(r!(n-r)!)</code></p>
     *
     * @param n
     * @param r
     * @return The combination of <code>n</code> and <code>r</code>.
     *
     * @throws IllegalArgumentException If a negative number is passed.
     */

    public static int combination(int n, int r) {
        int result;

        try {
            result = permutation(n, r) / factorial(r);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("A negative number cannot be combined!");
        }

        return result;
    }
}
