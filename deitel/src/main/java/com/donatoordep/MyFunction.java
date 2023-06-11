package com.donatoordep;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class MyFunction {

    public static void main(String[] args) {

        Double number1 = 5.0, number2 = 3.0;
        BinaryOperator<Double> media = (num1, num2) -> (num1 + num2) / 2;
        Function<Double, String> verifyMedia = number -> number >= 6.0 ? "Approved" : "Disapproved";

        System.out.printf("Media: %.2f%nResult: %s", media.apply(number1, number2),
                verifyMedia.apply(media.apply(number1, number2)));
    }
}
