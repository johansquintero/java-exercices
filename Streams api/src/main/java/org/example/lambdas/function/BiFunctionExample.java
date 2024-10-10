package org.example.lambdas.function;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> plus = Integer::sum;
        Integer result = plus.apply(10,5);
        System.out.println(result);
    }
}
