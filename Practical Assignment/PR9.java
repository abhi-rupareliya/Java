/*  ID   : 21ce117
    Name : Abhi Rupareliya
    Aim  : Design an interface named Colorable with a void method named howToColor(). 
           Every class of a colorable object must implement the Colorable interface. Design a 
           class named Square that extends GeometricObject and implements Colorable. 
           Implement howToColor to display the message Color all four sides. The Square
           class contains a data field side with getter and setter methods, and a constructor for 
           constructing a Square with a specified side. The Square class has a private double 
           data field named side with its getter and setter methods. It has a no-arg constructor to 
           create a Square with side 0, and another constructor that creates a Square with the 
           specified side.

 */

interface Colorable {
    public void howToColor();
}

abstract class GeometricObject {
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Square extends GeometricObject implements Colorable {
    private double side;

    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getSide() {
        return side;
    }

    public Square() {
        side = 0;
    }

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }

    public String toString() {
        return "Square: side = " + getSide();
    }

}

public class PR9 {
    public static void main(String[] args) {

        Square s = new Square(10);
        System.out.println(s); // toString()
        System.out.println("Area : "+s.getArea());
        System.out.println("Perimeter : "+s.getPerimeter());
        s.howToColor();
    }
}