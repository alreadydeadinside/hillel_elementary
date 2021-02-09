import deadlock.FirstClass;
import deadlock.SecondClass;
import threads.ExampleCallable;
import threads.ExampleRunnable;
import threads.ExampleThread;
import utils.ThreadHelper;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExampleThread exampleThread = new ExampleThread();
        ExampleRunnable exampleRunnable = new ExampleRunnable();
        ExampleCallable exampleCallable = new ExampleCallable();

        exampleThread.start();
        exampleThread.join();


        Thread threadRunnable = new Thread(exampleRunnable);
        threadRunnable.start();
        threadRunnable.join();

        FutureTask<String> task = new FutureTask<>(exampleCallable);
        Thread threadCallable = new Thread(task);
        threadCallable.start();
        threadCallable.join();
        String result = task.get();
        System.out.println("Thread Callable: " + result + "\n");

        Thread.sleep(1000);
        System.out.println("Increments: " + ThreadHelper.increment);

        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();

        firstClass.setSecondClass(secondClass);
        secondClass.setFirstClass(firstClass);

        Thread first = new Thread(() -> System.out.println(firstClass.getStringFromSecondClass()));
        Thread second = new Thread(() -> System.out.println(secondClass.getStringFromFirstClass()));

        first.start();
        second.start();
    }
}