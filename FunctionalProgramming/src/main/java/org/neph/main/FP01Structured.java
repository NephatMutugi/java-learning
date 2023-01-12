package org.neph.main;

import java.util.List;

/**
 * @ Author NMuchiri
 **/
public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    // Traditional Approach to loop through numbers
    private static void printAllNumbersInListStructured(List<Integer> numberList) {
        System.out.println("NUMBER LIST");
        for (int number : numberList) {
            System.out.println(number);
        }
    }
}
