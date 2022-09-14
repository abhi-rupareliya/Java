/*
Name: Rupareliya Abhi K.
Id  : 21CE117
Pr  : Write a program to create a default method in an interface IPrinter. Create
      an interface IPrinter and IScanner. You can assume variables and methods for both
      interfaces. Create a concrete class to implement both the interfaces. Create 5 objects of the
      class, store it in Vector and display the result of the vector.
*/

import java.util.Vector;

interface IPrinter {
    void print();
}

interface IScanner {
    void scan();
}

class Concrete implements IPrinter, IScanner {
    public void print() {
        System.out.println("print() method called");
    }

    public void scan() {
        System.out.println("scan() method called");
    }
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        Vector <Concrete> vec = new Vector<>();

        for (int i = 0; i < 5; i++) {
            vec.add(new Concrete());
        }

        vec.get(4).print();
        vec.get(1).scan();
    }
}
