/*
Name: Rupareliya Abhi K.
Id  : 21CE117
Pr  : WAP that illustrate the interface inheritance. Interface
      P is extended by P1 and P2 interfaces.
      Interface P12 extends both P1 and P2. Each interface declares one method and
      one constant. Create one class that implements P12. By using the object of the
      class invokes each of its method and displays constant.
*/

interface P {
    void method();
}

interface P1 extends P {
    void method1();
}

interface P2 extends P {
    void method2();
}

interface P12 extends P1, P2 {
    void method12();
}

class Concrete implements P12 {
    public void method() {
        System.out.println("Method in Interface P is called");
    }

    public void method1() {
        System.out.println("Method in Interface P1 is called");
    }

    public void method2() {
        System.out.println("Method in Interface P2 is called");
    }

    public void method12() {
        System.out.println("Method in Interface P12 is called");
    }
}

public class InterfaceInheritance {
    public static void main(String args[]) {
        Concrete obj = new Concrete();
        obj.method();
        obj.method1();
        obj.method2();
        obj.method12();
    }
}
