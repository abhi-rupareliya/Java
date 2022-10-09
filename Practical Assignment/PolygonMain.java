public class PolygonMain {
    public static void main(String[] args) {
        RegularPolygon polygon = new RegularPolygon(4, 10, 2, 2);
        System.out.println("No. of sides : " + polygon.getN());
        System.out.println("Length of sides : " + polygon.getSide());
        System.out.println("X : " + polygon.getX());
        System.out.println("Y : " + polygon.getY());
        System.out.println("Area : " + polygon.getArea());
        System.out.println("Perimeter : " + polygon.getPerimeter());
    }
}
