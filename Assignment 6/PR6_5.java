/*
   Name: Abhi Rupareliya
   ID  : 21ce117
   Pr  : Write a program to solve producer-consumer problem using thread Synchronization.
*/

/*
 * This program has 2 threads Producer(pt) and Consumer(ct).
 * Producer thread will add values to LinkedList (2 values at a time).
 * Consumer will be able to retrive these values only after Producer has Produced some values.
 * Both Thread will execute synchronously. 
 */

public class PR6_5 {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();

        // Creating a producer thread
        Thread pt = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Creating consumer thread
        Thread ct = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        pt.start();
        ct.start();

        // producer finishes before consumer
        pt.join();
        ct.join();
    }
}