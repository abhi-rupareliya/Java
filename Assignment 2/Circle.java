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

public class Circle{
    private double radius;

    public Circle() {
        radius = 1;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 22*radius*radius/7;
    }
    public double getPerimeter(){
        return 2*22*radius/7;
    }
}
