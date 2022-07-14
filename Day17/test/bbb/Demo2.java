package test.bbb;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        useList(list1);
        useList(list2);
//        useList(list3)

//        useList1(list1);
        useList1(list2);
        useList1(list3);

    }
    public static void useList1(ArrayList<? extends Number> list){//上限

    }

    public static void useList(ArrayList<? super Number> list) {//下限

    }
}
