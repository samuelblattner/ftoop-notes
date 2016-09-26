package threading.consumer_producer;

/**
 * Created by samuelblattner on 24/09/16.
 */
public class Queue {

    private Integer[] queue;
    private int stackPointer = 0;
    private int dequeuePointer = 0;

    public Queue(int size) {
        this.queue = new Integer[size];
        for (int i=0; i<queue.length; i++) {
            queue[i] = null;
        }
    }

    public synchronized boolean enqueue(Integer newElement) throws InterruptedException {

        while(queue[stackPointer] != null) {
            System.out.println("---> QUEUE: Enqueuing suspended!");
            this.wait();
        }

        queue[stackPointer] = newElement;
        stackPointer++;

        if (stackPointer >= queue.length) {
           stackPointer = 0;
        }

        this.notifyAll();
        return true;
    }

    public synchronized Integer dequeue() throws InterruptedException {

        while (queue[dequeuePointer] == null) {
            System.out.println("---> QUEUE: Dequeuing suspended!");
            this.wait();
        }

        Integer returnElement = queue[dequeuePointer];
        queue[dequeuePointer] = null;

        dequeuePointer++;
        if (dequeuePointer >= queue.length) {
            dequeuePointer = 0;
        }

        this.notifyAll();
        return returnElement;
    }
}
