package com.donatoordep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(3, 5, 2, 13));

        Function<List<Integer>, Integer> sequenceSum = _list -> {
            Integer concatenate = 0;
          for (Integer list : _list){
              concatenate += list;
          }
          return concatenate;
        };

        System.out.println(sequenceSum.apply(numeros));
    }
}