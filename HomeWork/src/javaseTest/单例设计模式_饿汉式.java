package javaseTest;

public class 单例设计模式_饿汉式 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}
class Singleton{
//    1.私有化构造器
    private Singleton() {
    }
//    2.内部创建类的对象
    private static Singleton sl = new Singleton();

    //3.提供公共的方法,返回类的对象
    public static Singleton getInstance(){
        return sl;
    }
}