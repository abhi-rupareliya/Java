/*  ID   : 21ce117
    Name : Abhi Rupareliya
    Aim  : Create a class named Stack. Design a class named Queue for storing integers. Like a 
           stack, a queue holds elements. In a stack, the elements are retrieved in a last-in first out fashion. In a queue, the elements are retrieved in a first-in first-out fashion. The 
           class contains: 
             An int[] data field named elements that stores the int values in the queue. 
             A data field named size that stores the number of elements in the queue. 
             A constructor that creates a Queue object with default capacity 8.
             The method enqueue(int v) that adds v into the queue.
             The method dequeue() that removes and returns the element from the queue.
             The method empty() that returns true if the queue is empty. 
             The method getSize() that returns the size of the queue.
 */
import java.util.Arrays;

class Queue {
    static int j = 0;
    int size;
    int a[] = null;

    Queue() {
        size = 8;
        a = new int[size];
    }

    Queue(int size) {
        this.size = size;
        a = new int[size];
    }

    public void enqueue(int v) {
        a[j++] = v;
    }

    public void dequeue() {
        a = null;
    }

    public boolean empty() {
        if (a == null)
            return true;
        else
            return false;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        System.out.println(Arrays.toString(a));

    }
}
