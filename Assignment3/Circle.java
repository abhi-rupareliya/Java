/*
Name: Rupareliya Abhi K.
Id  : 21CE117
Pr  : Create an abstract class GeometricObject as the superclass for Circle and
      Rectangle. GeometricObject models common features of geometric objects. Both
      Circle and Rectangle contain the getArea() and getPerimeter() methods for
      computing the area and perimeter of a circle and a rectangle. Since you can
      compute areas and perimeters for all geometric objects, so define the getArea() and
      getPerimeter() methods in the GeometricObject class. Give implementation in the
      specific type of geometric object. Create TestGeometricObject class to display area
      and perimeter of Rectangle and Triangle, compare area of both and display results.
*/

public class Circle extends GeometricObject {
    double radius;

    public Circle(double radius, boolean filled, String color) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
    
    public double getArea() {
        return 22 * radius * radius / 7;
    }

    public double getPerimeter() {
        return 2 * 22 * radius / 7;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
