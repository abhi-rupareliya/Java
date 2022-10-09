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