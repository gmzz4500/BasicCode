package com.yyds.a_abstract;

public class AbstractDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "汤姆";
        cat.age = 10;
        cat.eat("鱼");
        cat.sleep();
        cat.catchMouse();
        Dog dog = new Dog();
        dog.name = "来福";
        dog.age = 6;
        dog.eat("骨头");
        dog.sleep();
        dog.lookHome();
    }
}
abstract class Animal{
    String name;
    int age;
    public abstract void eat(String food);
    public abstract void sleep();
}
    class Cat extends Animal{

        @Override
        public void eat(String food) {
            System.out.println("猫吃" + food);
        }

        @Override
        public void sleep() {
            System.out.println("猫睡觉");
        }
        public void catchMouse(){
            System.out.println("猫抓老鼠");
        }

    }
class Dog extends Animal{
    @Override
    public void eat(String food) {
        System.out.println("狗吃" + food);
    }

    @Override
    public void sleep() {
        System.out.println("狗睡觉");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
