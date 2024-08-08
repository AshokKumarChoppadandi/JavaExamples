package com.bigdata.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FooBarExample {
    public static void main(String[] args) {
        int divisor1 = 11;
        int divisor2 = 17;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter any non zero number:");
        try {
            int inputNumber = Integer.parseInt(br.readLine());
            if (inputNumber == 0) {
                System.out.println("Please enter any non zero number:");
                System.exit(-1);
            }

            int remainder1 = inputNumber % divisor1;
            int remainder2 = inputNumber % divisor2;

            if (remainder1 == 0 && remainder2 == 0) {
                System.out.println("Foo Bar");
            } else if (remainder1 == 0) {
                System.out.println("Foo");
            } else if (remainder2 == 0) {
                System.out.println("Bar");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
