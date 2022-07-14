package javaseTest;

public class Demo {
    public static void main(String[] args) {
        method(100,10);
        System.out.println(15/2*2);
        int n=10;
        for (int i = 0; -i < n; i--) {
            System.out.println("=");
        }
    }
    public static void method(double high, int count) {
        double distance = 0;
        for (int i = 1; i <= count; i++) {
            distance += high;
            high /= 2;
            if(i!=count){
                distance += high;
            }
        }
        System.out.println("第" + count + "次落地共经过" + distance + "米"
                + "\n第" + count + "次反弹" + high + "米");


        char x = 'x';
        int i = 10;
        System.out.println(true? x : i);
        System.out.println(true? 'x' : 10);
    }
}
