package threads;
import utils.ThreadHelper;
import java.util.concurrent.Callable;

public class ExampleCallable implements Callable<String> {

    @Override
    public String call() {
        String result = "All Done!";
        Thread.currentThread().setName("Callable");
        for (int i = 0; i < 1000; i++) {
            ThreadHelper.printThread(Thread.currentThread());
        }
        return result;
    }
}