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

public class PR4 {
    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 0; i < 8; i++) {
            q.enqueue(i);
        }
        q.print();
        System.out.println("Size of the queue is :  " + q.getSize());
        q.dequeue();
        System.out.println(q.empty());

        Stack s = new Stack();
        for (int i = 0; i < 8; i++) {
            s.enqueue(i);
        }
        s.print();
        System.out.println("Size of the stack is :  " + s.getSize());
        s.dequeue();
        System.out.println(s.empty());
    }
}