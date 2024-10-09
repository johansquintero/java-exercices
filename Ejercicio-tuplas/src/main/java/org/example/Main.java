package org.example;

import io.vavr.Tuple4;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Pair<String, Integer> pairParams = task.returningPair();
        System.out.println("\n===Pair===\nParam 1:".concat(pairParams.getLeft()) + "\nParam 2:".concat(pairParams.getRight().toString()));

        Triple<String, Integer, Boolean> tripleParams = task.returningTriple();
        System.out.println("\n===Triple===\nParam 1:".concat(tripleParams.getLeft()) + "\nParam 2:".concat(tripleParams.getMiddle().toString()) + "\nParam 3:".concat(tripleParams.getRight().toString()));

        Tuple4 fourParams = task.returningFour();
        System.out.println("\n===Four tuple===\nParam 1:".concat((String) fourParams._1()) + "\nParam 2:".concat(fourParams._2().toString()) + "\nParam 3:".concat(fourParams._3().toString()) + "\nParam 4:".concat(fourParams._4().toString()));

    }


}