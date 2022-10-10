/*   ID   : 21ce117
     Name : Abhi Rupareliya
     Aim  : Design a class named Triangle that extends GeometricObject. 
            The class contains: Three double data fields named side1, side2, and side3 
            with default values 1.0 to denote three sides of a triangle. 
            • A no-arg constructor that creates a default triangle. 
            • A constructor that creates a triangle with the specified side1, side2, and side3.
            • The accessor methods for all three data fields.
            • A method named getArea() that returns the area of this triangle.
            • A method named getPerimeter() that returns the perimeter of this triangle.
            • A method named toString() that returns a string description for the triangle. 
            return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + 
            side3.
 */

abstract class GeometricObject {
    public abstract double getPerimeter();

    public abstract double getArea();
}

class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}

public class PR6 {
    public static void main(String[] args) {
        Triangle t = new Triangle(2, 2, 2);
        System.out.println(t);
        System.out.println("Perimeter : "+t.getPerimeter());
        System.out.println("Area : "+t.getArea());
    }
}