import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreadExample {
    private static final Logger LOGGER = Logger.getLogger(MultiThreadExample.class.getName());

    public static void main(String[] args) {
        // Creating and starting the threads
        Thread thread1 = new Thread(new PrintNumbers(), "Thread-1");
        Thread thread2 = new Thread(new PrintNumbers(), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

class PrintNumbers implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(PrintNumbers.class.getName());

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            LOGGER.log(Level.INFO, "{0} - {1}", new Object[]{Thread.currentThread().getName(), i});
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                LOGGER.log(Level.SEVERE, Thread.currentThread().getName() + " was interrupted", e);
                Thread.currentThread().interrupt(); // Restore the interrupt status
                break;
            }
        }
    }
}
