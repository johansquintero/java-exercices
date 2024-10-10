package org.example.streams;

import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson07_streams_generators {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("JAVA_HOME", "/opt/java/java21");
        properties.setProperty("MAVEN_HOME", "/opt/maven");
        properties.setProperty("CATALINA_HOME", "/opt/tomcat8");

        System.out.println("-----------------------ClassicForm----------------------");
        String values = properties.values()
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining("-"));
        System.out.println(values);

        System.out.println("-----------------------IntStream rangeClosed----------------------");
        //IntStream genera un stream de enteros en un rango cerrado(incluye el ultimo elmento)
        List<Integer> rangeClosed = IntStream.rangeClosed(1, 20).mapToObj(Integer::valueOf).collect(Collectors.toList());
        rangeClosed.forEach(n -> {
            System.out.print(n + " ");
        });

        System.out.println("\n-----------------------IntStream range----------------------");
        //IntStream genera un stream de enteros en un rango especifico(no incluye el ultimo elmento)
        List<Integer> range = IntStream.range(20, 40).mapToObj(Integer::valueOf).collect(Collectors.toList());
        range.forEach(n -> {
            System.out.print(n + " ");
        });

        System.out.println("\n-----------------------Stream concat----------------------");
        //Unifica dos strems ya existentes
        Stream<Integer> concat = Stream.concat(rangeClosed.stream(), range.stream()).sorted();
        concat.forEach(n -> {
            System.out.print(n + " ");
        });

        System.out.println("\n-----------------------Stream concat----------------------");
        AtomicInteger c = new AtomicInteger(0);
        List<Integer> numbers = Stream.generate(c::incrementAndGet).limit(5).toList();
        numbers.forEach(n -> {
            System.out.print(n + " ");
        });
    }
}
