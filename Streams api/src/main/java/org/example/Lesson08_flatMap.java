package org.example;

import java.util.List;

public class Lesson08_flatMap {
    public static void main(String[] args){
        List<String> fruits = List.of("Apple","Mango","Banana");
        List<String> variants = List.of("Green","Yellow","AnyColor");

        List<String> combinations = fruits.stream()
                .flatMap(fruta->variants.stream()
                        .map(variant->fruta+"-"+variant)
                ).toList();
        combinations.forEach(s -> {
            System.out.println(s);
        });
    }
}
