package method;

public class HomeWork09 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        System.out.println(circle1.findArea(4));
        PassObject passObject = new PassObject();
        passObject.printAreas(circle1, 10);
    }
}

class Circle1 {
    double radius;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(double radius) {
        return Math.PI * radius * radius;
    }

}

class PassObject {
    public void printAreas(Circle1 c, int times) {
        System.out.println("半径\t圆面积为:");
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea(c.radius));
        }
    }
}