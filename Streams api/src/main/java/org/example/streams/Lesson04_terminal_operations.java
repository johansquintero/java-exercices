package org.example.streams;

import java.util.List;

public class Lesson04_terminal_operations {
    public static void main(String[] args) {
        List<String> continents = List.of("America", "Europa", "Asia", "Africa", "Oceania", "Antartida");

        System.out.println("-----------------------FOREACH----------------------");
        //skip salta los primeros n elmentos
        continents.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------------------TOLIST----------------------");
        //toList empaqueta los elmentos del stream en una lista
        List<String> continetsSorted = continents.stream()
                .sorted()
                .toList();
        continetsSorted.forEach(System.out::println);

        System.out.println("-----------------------COUNT----------------------");
        //Cuenta la cantidad de elementos del stream
        long numberOfElements = continents.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .count();
        System.out.println(numberOfElements);


    }
}
