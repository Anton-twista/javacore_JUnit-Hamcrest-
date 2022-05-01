package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class StreamNumbers {
    public static void main(String[] args) {


        List<Integer> intNumbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 15, 8, 23, 4);

        List<Integer> even = getEvenNumbers(intNumbers);
        List<Integer> positive = getPositiveNumbers(intNumbers);


    }

    public static List<Integer> getEvenNumbers(List<Integer> intNumbers) {
        System.out.println("even: ");
        List<Integer> even = new ArrayList<>();

        for (Integer intNumber : intNumbers) {
            if (intNumber > 0 & intNumber % 2 == 0) {
                even.add(intNumber);
            }

        }
        System.out.println(even);
        return even;
    }

    public static List<Integer> getPositiveNumbers(List<Integer> intNumbers) {
        System.out.println("positive: ");
        List<Integer> positive = new ArrayList<>();
        for (Integer intNumber : intNumbers) {
            if (intNumber > 0) {
                positive.add(intNumber);
            }
        }
        System.out.println(positive);

        return positive;
    }
}
