package com.bigdata.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter two numbers.");
            System.out.println("Enter first number - ");
            int number1 = Integer.parseInt(br.readLine());

            System.out.println("Enter second number - ");
            int number2 = Integer.parseInt(br.readLine());

            System.out.println("Numbers before swapping\nNumber1 = " + number1 + "\nNumber2 = " + number2);

            System.out.println("Swapping two numbers without any third variable");
            number1 = number1 + number2;
            number2 = number1 - number2;
            number1 = number1 - number2;

            System.out.println("Numbers after swapping\nNumber1 = " + number1 + "\nNumber2 = " + number2);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
