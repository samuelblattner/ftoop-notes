package threading.consumer_producer;

import java.util.Random;

/**
 * Created by samuelblattner on 21/09/16.
 */
public class Producer implements Runnable {

    private Queue queue;
    private Random randomizer;

    public Producer(Queue queue) {
        this.queue = queue;
        randomizer = new Random();
    }

    @Override
    public void run() {

        while(true) {
            try {

                Thread.sleep(2000);
                int rndNumber = randomizer.nextInt();

                queue.enqueue(rndNumber);

                System.out.format("PRODUCER: Produced %d\n", rndNumber);

            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
