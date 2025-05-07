package com.spderman333.spderlib.math;

/**
 * The Combinatorics Class mainly offers methods that deal with factorials, permutations, and combinations.
 * <p>Do note, that all the functions will fail if a negative number, or a float is passed.</p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/Combinatorics">en.wikipedia.org/wiki/Combinatorics</a>
 *
 * @author Spderman333
 */


public class Combinatorics {

    /**
     * <p><code>n!</code></p>
     *
     * @param n Input for the factorial function.
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
     * <p><code>(n!)/(n-r)!</code></p>
     *
     * @param n Amount of objects.
     * @param r Amount of "slots."
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
     * <p><code>(n!)/(r!(n-r)!)</code></p>
     *
     * @param n Amount of objects.
     * @param r Amount of "slots."
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
