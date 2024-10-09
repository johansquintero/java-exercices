package org.example;

import java.util.List;

public class Lesson02_filter_and_maps {
    public static void main(String[] args) {
        List<String> continents = List.of("America","Europa","Asia","Africa","Oceania","Antartida");

        continents.stream()
                .filter((continent)->continent.length()>=6)
                .map((continent)->continent.length())
                .forEach(System.out::println);
    }
}
