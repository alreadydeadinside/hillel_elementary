package threads;
import utils.ThreadHelper;


public class ExampleThread extends Thread {

    @Override
    public void run() {
        currentThread().setName("Thread");
        for (int i = 0; i < 1000; i++) {
            ThreadHelper.printThread(currentThread());
        }
    }
}