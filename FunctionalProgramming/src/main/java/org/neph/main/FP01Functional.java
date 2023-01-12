package org.neph.main;

import org.apache.commons.lang3.StringUtils;

import java.util.List;


/**
 * @ Author NMuchiri
 **/
public class FP01Functional {
    public static void main(String[] args) {
        capitalizeAllInListFunctional(List.of("Hello. ", "Welcome ", "to Functional", " programming", " workshop."));
    }

    private static void capitalizeAllInListFunctional(List<String> stringList) {
        stringList
                .forEach(FP01Functional::printAll);
    }

    private static void printAll(String word){
        word = word.toUpperCase();
        System.out.print(word);
    }


}
