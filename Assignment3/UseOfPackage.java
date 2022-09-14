/*
Name: Rupareliya Abhi K.
Id  : 21CE117
Pr  : Write a program that demonstrates use of packages & import statements. 
*/

import Mypack.MyClass1; 
import Mypack.MyClass2; 

public class UseOfPackage {
    public static void main(String[] args) {
        MyClass1 m1 = new MyClass1(10);
        MyClass2 m2 = new MyClass2(50);

        System.out.println(m1);
        System.out.println(m2);
    }
}
