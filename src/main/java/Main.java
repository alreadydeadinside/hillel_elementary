import lock.LockExample;
import threads.FirstThread;
import threads.SecondThread;
import utils.ThreadHelper;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();

        firstThread.start();
        secondThread.start();

        Thread.sleep(15000);
        System.out.println("Decrements loop times: " + ThreadHelper.atomicInteger + "\n");

        //lock

        Thread lockThreadOne = new Thread(new Runnable() {
            private LockExample lockExample = new LockExample();

            @Override
            public void run() {
                Thread.currentThread().setName("first thread");

                lockExample.write();
                lockExample.print("first lock");
                lockExample.sum(15, 45);
            }
        });

        Thread lockThreadTwo = new Thread(new Runnable() {
            private LockExample lockExample = new LockExample();

            @Override
            public void run() {
                Thread.currentThread().setName("second thread");

                lockExample.write();
                lockExample.print("second lock");
                lockExample.sum(3, 7);
            }
        });

        Thread lockThreadThree = new Thread(new Runnable() {
            private LockExample lockExample = new LockExample();

            @Override
            public void run() {
                Thread.currentThread().setName("third thread");

                lockExample.write();
                lockExample.print("third lock");
                lockExample.sum(50, 100);
            }
        });

        lockThreadOne.start();
        lockThreadOne.join();
        lockThreadTwo.start();
        lockThreadTwo.join();
        lockThreadThree.start();
    }
}