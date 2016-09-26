package threading.consumer_producer;

/**
 * Created by samuelblattner on 24/09/16.
 */
public class Runner {

    public static void main(String args[]) {
        Queue queue = new Queue(2);

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();
    }
}
