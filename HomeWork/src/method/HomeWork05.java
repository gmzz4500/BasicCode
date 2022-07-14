package method;

public class HomeWork05 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("周长为:" + circle.getPerimeter(20));
        System.out.println("面积为:" + circle.getArea(20));
    }
}

class Circle {
    double radius;
    double perimeter;
    double area;

    public double getPerimeter(double radius) {
//        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getArea(double radius) {
        area = Math.PI * radius * radius;
        return area;
    }
}