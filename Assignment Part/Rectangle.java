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

public class Rectangle extends GeometricObject {

    double height;
    double width;

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public Rectangle(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}
