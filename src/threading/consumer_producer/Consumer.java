package threading.consumer_producer;

/**
 * Created by samuelblattner on 21/09/16.
 */
public class Consumer implements Runnable {

    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {

                Thread.sleep(4000);
                Integer dequeuedNumber = queue.dequeue();

                System.out.println(String.format("CONSUMER: Read number %d", dequeuedNumber));

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

}
