package org.example;

import java.util.List;
import java.util.Optional;

public class Lesson05_reduce_operation {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 6, 2, 7, 3, 4, 11, 10);
        List<String> continents = List.of("America", "Europa", "Asia", "Africa", "Oceania", "Antartida");


        System.out.println("-----------------------REDUCE1----------------------");
        int result = numbers.stream()
                .reduce(0, (integer, integer2) -> integer + integer2);
        System.out.println(result);

        System.out.println("-----------------------REDUCE2----------------------");
        int c = continents.stream()
                .map(String::length)
                .reduce(0, (acum, lon) -> acum + lon);
        System.out.println(c);

        System.out.println("-----------------------REDUCE3----------------------");
        Optional<Integer> opt = continents.stream()
                .map(String::length)
                .reduce( (acum, lon) -> acum + lon);
        System.out.println(opt);

        System.out.println("-----------------------REDUCE4----------------------");
        int r = continents.stream()
                .reduce(0,(acum, s) -> acum + s.length(),Integer::sum);
        System.out.println(r);

    }
}
