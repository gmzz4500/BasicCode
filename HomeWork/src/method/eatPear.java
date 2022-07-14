package method;

public class eatPear {
    public static void main(String[] args) {
        //第10天:1个桃子
        //第9天:(1+1)*2
        //...
        //定义一个变量接收桃子总数
        int count = getCount();
        System.out.println("最初的桃子个数为: " + count);

    }

    public static int getCount() {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                total = 1;
            } else {
                total = (total + 1) * 2;
            }
        }
        return total;
    }

}
