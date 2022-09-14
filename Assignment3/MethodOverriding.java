/*
Name: Rupareliya Abhi K.
Id  : 21CE117
Pr  : Develop a Program that illustrate method overriding concept.
*/

class Parent{
    public void method(){
        System.out.println("method in parent is called");
    }
}

class Child extends Parent{
    @Override
    public void method(){
        super.method(); // we can call super class version of method.
        System.out.println("method from child is called");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Child cobj = new Child();
        cobj.method();
    }
}
