public class MultiThreadExample {
    public static void main(String[] args) {
        // Creating and starting the threads
        Thread thread1 = new Thread(new PrintNumbers(), "Thread-1");
        Thread thread2 = new Thread(new PrintNumbers(), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

class PrintNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}