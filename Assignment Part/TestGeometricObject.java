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

public class TestGeometricObject {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("Yellow",true,10,10);
        Circle cir = new Circle();
        cir.setColor("red");
        cir.setFilled(true);
        cir.setRadius(10);

        System.out.println("Rectangle __________");
        System.out.println("Area = "+rec.getArea());
        System.out.println("Perimeter = "+rec.getPerimeter());
        System.out.println(rec);
        System.out.println();
        
        System.out.println("Circle __________");
        System.out.println("Area = "+cir.getArea());
        System.out.println("Perimeter = "+cir.getPerimeter());
        System.out.println(cir);
    }
}
