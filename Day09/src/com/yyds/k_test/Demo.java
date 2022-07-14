package com.yyds.k_test;

public class Demo {
    public static void main(String[] args) {
        Animal a1 = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头~");
            }
        };
        useAnimal(a1);
        Animal a2 = new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼~");
            }
            public void catchMouse(){
                System.out.println("猫抓老鼠~");
            }
        };
        useAnimal(a2);
        Animal a3 = new Animal() {
            @Override
            public void eat() {
                System.out.println("老虎吃肉~");
            }
        };
        useAnimal(a3);
    }
    public static void useAnimal(Animal animal){
        animal.eat();
    }
}

