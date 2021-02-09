package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    Lock lock = new ReentrantLock();

    public void write() {
        lock.lock();
        System.out.println(Thread.currentThread().getName());
    }

    public void print(String string) {
        System.out.println(string);
    }

    public void sum(int a, int b) {
        System.out.println("Result of sum (a+b): " + (a + b));
        lock.unlock();
    }
}