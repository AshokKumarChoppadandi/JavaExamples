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
    @Test
    public void testAdditionOfTwoInteger() {
        int actual = basicCalculator.add(10, 20);
        Assertions.assertEquals(actual, Math.addExact(10, 20));
    }

    @Test
    public void testPowerOfANumber() {
        double actual = basicCalculator.power(10, 3);
        Assertions.assertEquals(actual, Math.pow(10, 3));
    }

    @Test
    public void testToUpperCase() {
        String inputString = "hello";
        String actual = basicCalculator.toUpperCase(inputString);
        Assertions.assertEquals(actual, inputString.toUpperCase());
    }

    @AfterAll
    public static void exitUnitTests() {
        System.out.println("All unit tests execution completed.");
    }
}
