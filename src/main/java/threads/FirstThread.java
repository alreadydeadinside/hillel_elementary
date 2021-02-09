package threads;

import utils.ThreadHelper;

public class FirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(() -> {
                currentThread().setName("FIRST.threads");
                ThreadHelper.printThread(currentThread());
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}