package com.donatoordep.application;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Number> numbers = Arrays.asList(9, 10, 43, 2, 5, 0, 1, 7);

        numbers.stream().map(i -> new BigInteger(String.valueOf(i).getBytes()).toString(2))
                .map(n -> new StringBuilder(n).reverse().toString())
                .map(u -> Integer.parseInt(u, 2))
                .forEach(System.out::println);
    }

}
