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

    /**
     * A simple `power` method to get number1 power of number2
     * @param a Double - addition argument1
     * @param b Double - addition argument1
     * @return Double - The addition of two input numbers
     */
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    /**
     * Converts the input string to uppercase.
     *
     * @param str the string to convert
     * @return the uppercase version of the input string
     * @throws NullPointerException if the input string is null
     */
    public String toUpperCase(String str) {
        if (str == null) {
            throw new NullPointerException("Input string cannot be null");
        }
        return str.toUpperCase();
    }

    /**
     * Converts the input string to lowercase.
     *
     * @param str the string to convert
     * @return the lowercase version of the input string
     * @throws NullPointerException if the input string is null
     */
    public String toLowerCase(String str) {
        if (str == null) {
            throw new NullPointerException("Input string cannot be null");
        }
        return str.toLowerCase();
    }
}
