package test.bbb;

import java.util.Hashtable;

public class Demo1 {
    public static void main(String[] args) {
        Zi<String> zi = new Zi<>();
        zi.show("");

        Zi<Object> zi1 = new Zi<>();
        zi1.show(1);

        Hashtable<Integer, String> ht = new Hashtable<>();

    }
}

//泛型接口
interface Uncle<T>{
    public abstract void show(T t);
}

//沿用的情况
class Zi<T> implements Uncle<T>{

    @Override
    public void show(T t) {

    }
}

//不沿用
class Son implements Uncle{

    @Override
    public void show(Object o) {

    }
}
