package operator;

/*
 * 输出小写的a-z以及大写的Z-A
 * */
public class HomeWork10 {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println("");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }
}
