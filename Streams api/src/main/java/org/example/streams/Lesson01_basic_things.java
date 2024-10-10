package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class Lesson01_basic_things {
    private static List<String> list() {
        return Arrays.asList("Cucuta", "Pamplona", "Bogota", "Bogota", "New york", "Paris", "Caracas", "La paz", "Tokyo", "Oslo", "Seul", "Miami");
    }

    public static void main(String[] args) {
        List<String> cities = list();
        cities.stream()//generador de stream
                //piezas intermedias
                .distinct()
                .filter(city->city.toLowerCase().startsWith("p") || city.toLowerCase().endsWith("a"))
                //reductor
                .forEach(System.out::println);
    }
}