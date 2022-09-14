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

import java.util.Date;

public abstract class GeometricObject {
    String color;
    boolean filled;
    Date dateCreated;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public GeometricObject() {
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject [color=" + color + ", dateCreated=" + dateCreated + ", filled=" + filled + "]";
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}