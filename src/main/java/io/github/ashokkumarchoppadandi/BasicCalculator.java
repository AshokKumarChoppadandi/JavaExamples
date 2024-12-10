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
     * A simple `toUpperCase` method to convert the given input string to uppercase
     * @param str String - input argument of String type
     * @return String - Uppercase string
     */
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
