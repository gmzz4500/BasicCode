package method;

public class HomeWork06 {
    public static void main(String[] args) {
        Cale cale = new Cale();
        System.out.println("cale.multiplication(5,6) = " + cale.multiplication(5, 6));
        System.out.println("cale.division(10,2) = " + cale.division(10, 2));
    }
}

class Cale {
    double divisor;
    double dividend;

    public double multiplication(double dividend, double divisor) {
        return dividend * divisor;
    }

    public double division(double dividend, double divisor) {
        return dividend / divisor;
    }

    public double addition(double dividend, double divisor) {
        return dividend + divisor;
    }

    public double subtraction(double dividend, double divisor) {
        return dividend - divisor;
    }
}
