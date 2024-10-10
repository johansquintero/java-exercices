package org.example.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Lesson06_stream_types {

    public static void main(String[] args) throws IOException {
        Stream<Path> xd = Files.list(Paths.get("."));
        long sum = xd.map(Path::toFile)
                .mapToLong(File::length)
                .sum();
        System.out.println(sum);

    }
}
