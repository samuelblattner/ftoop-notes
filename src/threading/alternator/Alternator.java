package threading.alternator;

/**
 * Alternator example
 */
public class Alternator implements Runnable {

    // This will be a reference to an external lock
    private boolean[] chosen_alternator_lock;

    // This alternator's ID (true or false)
    private boolean alternatorID;

    // This alternator's name
    private String name;


    /**
     * Constructor
     */
    private Alternator(String name, boolean alternatorID, boolean[] chosen_alternator_lock) {
        this.name = name;
        this.alternatorID = alternatorID;
        this.chosen_alternator_lock = chosen_alternator_lock;
    }

    /**
     * Here's the actual work done
     */
    private void printMessage() {


        // Check if this alternator can enter the critical zone
        synchronized (chosen_alternator_lock) {

            // Check if it's this alternator's turn, otherwise wait and give way
            // for the other alternator.
            try {
                while (chosen_alternator_lock[0] != alternatorID) {
                    this.chosen_alternator_lock.wait();
                }
            } catch (InterruptedException e) {

            }
            System.out.println(String.format("Hello from Alternator ID %s", name));
            chosen_alternator_lock[0] = !alternatorID;
            chosen_alternator_lock.notifyAll();
        }
    }

    /**
     * Keep run method as small as possible
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            printMessage();
        }
    }

    public static void main(String args[]) {
        boolean[] chosen_alternator_lock = new boolean[1];
        chosen_alternator_lock[0] = true;
        Thread alternator1 = new Thread(new Alternator("First Alternator", true, chosen_alternator_lock));
        Thread alternator2 = new Thread(new Alternator("Second Alternator", false, chosen_alternator_lock));
        alternator1.start();
        alternator2.start();
    }
}
