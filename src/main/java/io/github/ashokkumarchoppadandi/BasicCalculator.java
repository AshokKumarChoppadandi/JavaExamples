package io.github.ashokkumarchoppadandi;

/**
 * A simple calculator class to perform basic arithmetic operations with two numbers
 */
public class BasicCalculator {
    /**
     * Default Constructor
     */
    public BasicCalculator() {}

    /**
     * A simple `add` method to add two integer numbers
     * @param a Integer - addition argument1
     * @param b Integer - addition argument1
     * @return Integer - The addition of two input numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}
