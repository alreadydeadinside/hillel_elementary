package threads;
import utils.ThreadHelper;

public class ExampleRunnable implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("Runnable");
        for (int i = 0; i < 1000; i++) {
            ThreadHelper.printThread(Thread.currentThread());
        }
    }
}