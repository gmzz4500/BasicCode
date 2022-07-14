package javaseTest;

public class 单例设计模式_懒汉式_线程安全 {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton2 {
    //私有构造器

    private Singleton2() {
    }

    //内部创建对象,但不初始化
    private static Singleton2 instance = null;

    //提供公开方法返回当前类对象
    public static Singleton2 getInstance() {
        if(instance==null){
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}