package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Fork[] forks = new Fork[5];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork(i + 1);
        }
        for (int i = 0; i < forks.length; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % 5];
            philosophers[i] = new Philosopher(rightFork, leftFork, philosopherName.get(i));
            Thread thread = new Thread(philosophers[i]);
            thread.start();
        }
    }
    private static final Map<Integer, String> philosopherName = new HashMap<>() {{
        put(0, "Сократ");
        put(1, "Аристотель");
        put(2, "Платон");
        put(3, "Диоген");
        put(4, "Демокрит");
    }};
}