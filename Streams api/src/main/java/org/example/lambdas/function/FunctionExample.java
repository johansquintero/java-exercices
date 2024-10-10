package org.example.lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /**
         * Function
         * Recibe un valor y retorna un resultado
         */
        Function<Integer,String> function = n -> "Number as string = ".concat(String.valueOf(n));

        String result = function.apply(23);
        System.out.println(result);
    }
}
