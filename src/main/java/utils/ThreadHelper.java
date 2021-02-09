package utils;

public class ThreadHelper {

    public static int increment = 0;

    public static void printThread(Thread thread) {
        System.out.println(thread.getName() + " Incremented times: " + increment++);
    }
}