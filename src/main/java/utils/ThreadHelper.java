package utils;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadHelper {

    public static AtomicInteger atomicInteger = new AtomicInteger();

    public synchronized static void printThread(Thread thread) {
        System.out.println(thread.getName() + "Decrement: " + atomicInteger.decrementAndGet());
    }
}