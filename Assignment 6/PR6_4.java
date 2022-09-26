/*
   Name: Abhi Rupareliya
   ID  : 21ce117
   Pr  : Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the
         priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the
         ‘THIRD’ thread to 7.
*/

public class PR6_4 {
    public static void main(String[] args) {
        FIRST fobj = new FIRST();
        fobj.setName("FIRST");
        SECOND sobj = new SECOND();
        sobj.setName("SECOND");
        THIRD tobj = new THIRD();
        tobj.setName("THIRD");

        fobj.setPriority(3);
        sobj.setPriority(5);
        tobj.setPriority(7);

        fobj.start();
        sobj.start();
        tobj.start();
    }
}

class FIRST extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getPriority());
    }
}

class SECOND extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getPriority());
    }
}

class THIRD extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getPriority());
    }
}