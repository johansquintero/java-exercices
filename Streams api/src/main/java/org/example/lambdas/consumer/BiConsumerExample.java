package org.example.lambdas.consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /**
         * BiConsumer
         * Recibe 2 valores y no retorna nada
         */
        BiConsumer<Integer, String> biConsumer = (n, s) -> System.out.println(n + "." + " " + s);

        biConsumer.accept(1, "Hello world");
    }
}
