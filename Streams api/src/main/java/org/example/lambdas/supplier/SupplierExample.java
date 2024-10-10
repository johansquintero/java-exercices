package org.example.lambdas.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /**
         * Supplier
         * no recibe ningun parametro, pero si retorna uno
         */
        Supplier<String> supplier = () -> "Hello World!";
        String result = supplier.get();
        System.out.println(result);
    }
}
