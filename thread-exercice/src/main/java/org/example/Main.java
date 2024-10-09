package org.example;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();


        AtomicBoolean isFound = new AtomicBoolean(false);


        System.out.print("Enter the limit letter:");
        char character = sc.next().toLowerCase().charAt(0);
        Runnable alphabet = () -> {
            try {
                Thread.currentThread().setName("Alphabet");
                for (char i = 'a'; i <= character; i++) {
                    Thread.sleep(500);

                    System.out.println("Actual char:" + i);
                    isFound.set(i == character);
                    if (isFound.get()) {
                        System.out.println("Letter " + i + " found!");
                        System.out.println("Thead job " + Thread.currentThread().getName() + " finished!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        };


        System.out.print("Enter the number to count:");
        int number = sc.nextInt();
        AtomicInteger numberAtomic = new AtomicInteger(number);
        Runnable timer = () -> {
            try {
                Thread.currentThread().setName("Timer");

                while (!isFound.get()){
                    Thread.sleep(600);
                    System.out.println("Timer:" + numberAtomic.getAndDecrement());
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("Thead job " + Thread.currentThread().getName() + " finished!");
        };
        executor.submit(alphabet);
        executor.submit(timer);
        executor.awaitTermination(30, TimeUnit.SECONDS);
        executor.shutdown();

    }
}