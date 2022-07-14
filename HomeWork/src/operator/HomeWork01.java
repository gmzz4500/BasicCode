package operator;

public class HomeWork01 {
    public static void main(String[] args) {
//        byte b = 10;
//        b += 2; // 等价 b = (byte)(b + 2);
//        System.out.println("b = " + b);
//        b++; // b = (byte)(b+1);
//        System.out.println("b = " + b);
//        System.out.println(0x23A);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入:");
//        int i = sc.nextInt();
//        System.out.println("i = " + i);
////        String s1 = sc.nextLine();
//        System.out.println("输入:");
//        String s = sc.nextLine();
//        System.out.println("s = " + s);


//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " * " + i + " = " + i*j + "\t");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i < 6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i < 6; i++) {
//            for (int j = 5; j > 0; j--) {
//                if(j>i){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //控制打印每层的个数
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == 5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
