package com.bigdata.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter any number:");
            int number = Integer.parseInt(br.readLine());
            System.out.println("Result :: " + sumOfDigitsOfANumber(number));
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sumOfDigitsOfANumber(int number) {
        if (number / 10 == 0) {
            return number;
        }
        return number % 10 + sumOfDigitsOfANumber(number / 10);
    }
}
