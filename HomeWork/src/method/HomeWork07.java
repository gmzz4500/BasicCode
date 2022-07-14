package method;

public class HomeWork07 {
    public static void main(String[] args) {
        Dog dog = new Dog("富贵", "黑色", 5);
        dog.show();
    }
}

class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Dog() {
    }

    public void show() {
        System.out.println("名字:\t" + "颜色:\t" + "年龄:\n" + name + "\t" + color + "\t" + age + "\t");
    }
}