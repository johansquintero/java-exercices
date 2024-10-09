package org.example;

import io.vavr.Tuple;
import io.vavr.Tuple4;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

public class Task {
    public String returningString() {
        return "Hello world!";
    }

    public Integer returningNumber() {
        return 10;
    }

    //return 2 values - pair
    public Pair<String, Integer> returningPair() {
        return Pair.of("Hello world!", 10);
    }

    public Triple<String, Integer, Boolean> returningTriple() {
        return Triple.ofNonNull("Hello world!", 10, true);
    }

    public Tuple4<String, Integer, Boolean, Double> returningFour() {
        return Tuple.of("Hello world!", 10, true, 5.3);
    }
}
