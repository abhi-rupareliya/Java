/*
Name : Rupareliya Abhi K.
ID   : 21ce117.
Aim  : Design a class named Circle containing following attributes and behavior.
            •One double data field named radius. The default value is 1.
            •A no-argument constructor that creates a default circle.
            •A Single argument constructor that creates a Circle with the specified radius.
            •A method named getArea() that returns area of the Circle.
            •A method named getPerimeter() that returns perimeter of it.
*/

public class CircleMain {
    public static void main(String[] args) {
        Circle object1 = new Circle();
        Circle object2 = new Circle(1000);

        System.out.println("Area and Perimeter of Circle Object 1 is respectively : "+object1.getArea()+" and "+object1.getPerimeter());
        System.out.println("Area and Perimeter of Circle Object 2 is respectively : "+object2.getArea()+" and "+object2.getPerimeter());
    }
}
