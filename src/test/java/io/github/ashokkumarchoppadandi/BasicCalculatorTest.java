package io.github.ashokkumarchoppadandi;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BasicCalculatorTest {

    public static BasicCalculator basicCalculator;

    @BeforeAll
    public static void initialBasicCalculatorObject() {
        basicCalculator = new BasicCalculator();
        System.out.println("Initialized Basic Calculator Object.");
    }

    @AfterAll
    public static void destroyBasicCalculatorObject() {
        basicCalculator = null;
        System.out.println("Destroyed Basic Calculator Object.");
    }

    @Test
    public void testPowerWithInfinityBase() {
        /**
         * Tests the power method with infinity as the base.
         * This tests the behavior with extreme values.
         */
        Assertions.assertEquals(Double.POSITIVE_INFINITY, basicCalculator.power(Double.POSITIVE_INFINITY, 5));
        Assertions.assertEquals(0, basicCalculator.power(Double.POSITIVE_INFINITY, -5));
    }

    @Test
    public void testPowerWithNaNInput() {
        /**
         * Tests the power method with NaN as input.
         * This tests the behavior with invalid input.
         */
        Assertions.assertTrue(Double.isNaN(basicCalculator.power(Double.NaN, 5)));
        Assertions.assertTrue(Double.isNaN(basicCalculator.power(5, Double.NaN)));
    }

    @Test
    public void testPowerWithNegativeExponent() {
        /**
         * Tests the power method with a negative exponent.
         * This is an edge case that should be handled correctly.
         */
        double result = basicCalculator.power(2, -2);
        Assertions.assertEquals(0.25, result, 1e-10);
    }

    /**
     * Test the power method with positive base and exponent
     */
    @Test
    public void testPowerWithPositiveNumbers() {
        double base = 2.0;
        double exponent = 3.0;
        double expectedResult = 8.0;
        double actualResult = basicCalculator.power(base, exponent);
        Assertions.assertEquals(expectedResult, actualResult, 0.0001, "Power calculation with positive numbers failed");
    }

    @Test
    public void testPowerWithZeroBase() {
        /**
         * Tests the power method with zero as the base.
         * This is an edge case that should return 0 for positive exponents and infinity for negative exponents.
         */
        Assertions.assertEquals(0, basicCalculator.power(0, 5));
        Assertions.assertEquals(Double.POSITIVE_INFINITY, basicCalculator.power(0, -5));
    }

    @Test
    public void testPowerWithZeroExponent() {
        /**
         * Tests the power method with zero as the exponent.
         * This should always return 1, except when the base is also 0.
         */
        Assertions.assertEquals(1, basicCalculator.power(5, 0));
        Assertions.assertEquals(1, basicCalculator.power(-5, 0));
        Assertions.assertEquals(1, basicCalculator.power(0, 0));
    }

    @Test
    public void testToLowerCaseWithAllUpperCase() {
        /**
         * Test the toLowerCase method with a string containing only uppercase letters.
         * This should return a string with all lowercase letters.
         */
        String result = basicCalculator.toLowerCase("HELLO WORLD");
        Assertions.assertEquals("hello world", result);
    }

    @Test
    public void testToLowerCaseWithEmptyString() {
        /**
         * Test the toLowerCase method with an empty string.
         * This should return an empty string.
         */
        String result = basicCalculator.toLowerCase("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void testToLowerCaseWithMixedCase() {
        /**
         * Test the toLowerCase method with a string containing mixed case letters.
         * This should return a string with all lowercase letters.
         */
        String result = basicCalculator.toLowerCase("HeLLo WoRLd");
        Assertions.assertEquals("hello world", result);
    }

    @Test
    public void testToLowerCaseWithNonAlphabetic() {
        /**
         * Test the toLowerCase method with a string containing non-alphabetic characters.
         * This should return the same string, as non-alphabetic characters are not affected.
         */
        String result = basicCalculator.toLowerCase("123!@#$%^&*()");
        Assertions.assertEquals("123!@#$%^&*()", result);
    }

    /**
     * Test the toLowerCase method with a null input string
     */
    @Test
    public void testToLowerCaseWithNullInput() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            basicCalculator.toLowerCase(null);
        });
    }

    @Test
    public void testToLowerCaseWithNullInput_2() {
        /**
         * Test the toLowerCase method with null input.
         * This should throw a NullPointerException.
         */
        Assertions.assertThrows(NullPointerException.class, () -> {
            basicCalculator.toLowerCase(null);
        });
    }

    /**
     * Test the toLowerCase method with a non-null input string
     */
    @Test
    public void testToLowerCaseWithValidInput() {
        String input = "HELLO WORLD";
        String expected = "hello world";
        String result = basicCalculator.toLowerCase(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testToUpperCaseWithEmptyString() {
        /**
         * Tests the toUpperCase method with an empty string.
         * Expects an empty string to be returned.
         */
        String result = basicCalculator.toUpperCase("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void testToUpperCaseWithMixedCaseString() {
        /**
         * Tests the toUpperCase method with a mixed case string.
         * Expects the string to be converted to uppercase.
         */
        String result = basicCalculator.toUpperCase("MixEd CaSe");
        Assertions.assertEquals("MIXED CASE", result);
    }

    @Test
    public void testToUpperCaseWithNonAlphabeticCharacters() {
        /**
         * Tests the toUpperCase method with a string containing non-alphabetic characters.
         * Expects the string to be returned with alphabetic characters in uppercase and non-alphabetic characters unchanged.
         */
        String result = basicCalculator.toUpperCase("123!@#$%^&*()_+");
        Assertions.assertEquals("123!@#$%^&*()_+", result);
    }

    /**
     * Tests that the toUpperCase method correctly converts a non-null string to uppercase.
     */
    @Test
    public void testToUpperCaseWithNonNullString() {
        String input = "Hello, World!";
        String expected = "HELLO, WORLD!";
        String result = basicCalculator.toUpperCase(input);
        Assertions.assertEquals(expected, result);
    }

    /**
     * Test that toUpperCase method throws NullPointerException when input is null
     */
    @Test
    public void testToUpperCaseWithNullInput() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            basicCalculator.toUpperCase(null);
        });
    }

    @Test
    public void testToUpperCaseWithNullInput_2() {
        /**
         * Tests the toUpperCase method with null input.
         * Expects a NullPointerException to be thrown.
         */
        Assertions.assertThrows(NullPointerException.class, () -> {
            basicCalculator.toUpperCase(null);
        });
    }

    @Test
    public void testToUpperCaseWithWhitespaceString() {
        /**
         * Tests the toUpperCase method with a string containing only whitespace.
         * Expects the same whitespace string to be returned.
         */
        String input = "   ";
        String result = basicCalculator.toUpperCase(input);
        Assertions.assertEquals(input, result);
    }

    @Test
    public void testAddWithMaxIntegerValues() {
        /**
         * Tests the add method with maximum integer values.
         * This tests the behavior when the result exceeds the integer range.
         */
        int result = basicCalculator.add(Integer.MAX_VALUE, 1);
        Assertions.assertEquals(Integer.MIN_VALUE, result, "Adding 1 to MAX_VALUE should overflow to MIN_VALUE");
    }

    @Test
    public void testAddWithMinIntegerValues() {
        /**
         * Tests the add method with minimum integer values.
         * This tests the behavior when the result is below the integer range.
         */
        int result = basicCalculator.add(Integer.MIN_VALUE, -1);
        Assertions.assertEquals(Integer.MAX_VALUE, result, "Subtracting 1 from MIN_VALUE should underflow to MAX_VALUE");
    }

    @Test
    public void testAddWithNegativeNumbers() {
        /**
         * Tests the add method with negative numbers.
         * This tests the behavior of adding negative numbers.
         */
        Assertions.assertEquals(-5, basicCalculator.add(-2, -3), "Adding negative numbers should work correctly");
    }

    /**
     * Tests the add method with positive integers
     */
    @Test
    public void testAddWithPositiveIntegers() {
        int a = 5;
        int b = 3;
        int expectedResult = 8;
        int actualResult = basicCalculator.add(a, b);
        Assertions.assertEquals(expectedResult, actualResult, "Addition of positive integers failed");
    }

    @Test
    public void testAddWithZero() {
        /**
         * Tests the add method with zero as one of the arguments.
         * This tests the behavior of adding zero to a number.
         */
        Assertions.assertEquals(5, basicCalculator.add(5, 0), "Adding zero should return the same number");
        Assertions.assertEquals(5, basicCalculator.add(0, 5), "Adding zero should return the same number");
    }
}
