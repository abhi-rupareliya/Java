/*
Name: Rupareliya Abhi K.
Id  : 21CE117
Pr  : Write a program that illustrates the significance of interface default method. 
*/

interface MyInterface {
    public void square(int a);

    default void show() {
        System.out.println("Default Method Executed");
    }

}

public class InterfaceDefault implements MyInterface{
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        InterfaceDefault obj = new InterfaceDefault();
        obj.square(4);
        obj.show(); // default method executes
    }
}