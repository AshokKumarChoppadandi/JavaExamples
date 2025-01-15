package com.bigdata.java;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> list1, list2, list3;
        list1 = list2 = list3 = new ArrayList<>();

        list1.add(1);
        list2.add(2);
        list3.add(3);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
