package org.example.streams;

import java.util.Comparator;
import java.util.List;

public class Lesson03_some_functions {
    public static void main(String[] args) {
        List<String> continents = List.of("America","Europa","Asia","Africa","Oceania","Antartida");

        //skip salta los primeros n elmentos
        System.out.println("-----------------------SKIP----------------------");
        continents.stream()
                .skip(2)
                .forEach(System.out::println);
        System.out.println("-----------------------LIMIT----------------------");
        //limit toma los primeros n elementos
        continents.stream()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("-----------------------PEEK----------------------");
        //peek sirve para realizar una inspeccion previa a los elementos
        continents.stream()
                .peek(s -> {
                    System.out.println("Continente:"+s);
                })
                .limit(5)
                .forEach(System.out::println);
        System.out.println("-----------------------DROPWHILE----------------------");
        //dropwhile descarta elementos miestras no se cumpla cierta condicion en falso y luego acepta el resto
        continents.stream()
                .sorted()//ordena los elmentos
                .dropWhile(s -> s.toLowerCase().startsWith("a"))
                .forEach(System.out::println);
        System.out.println("-----------------------TAKEWHILE----------------------");
        //takewhile acepta elementos mientras se cumpla cierta condicion en verdadero y luego para
        continents.stream()
                .sorted()//ordena los elmentos
                .takeWhile(s -> s.toLowerCase().startsWith("a"))
                .forEach(System.out::println);

        System.out.println("-----------------------SORTED----------------------");
        //Sorted ortena los elementos de forma natural sino se especicifa el criterio de comparacion
        continents.stream()
                .sorted(Comparator.comparingInt(String::length))//ordena los elmentos
                .forEach(System.out::println);

    }
}
