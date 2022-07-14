package com.yyds.a_polymorphism;

public class PolyDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        useAnimal(dog);
        Cat cat = new Cat();
        cat.eat();
        useAnimal(cat);
        Tiger tiger = new Tiger();
        tiger.eat();
        useAnimal(tiger);
    }
    public static void useAnimal(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.lookHome();
        }else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }else if (animal instanceof Tiger){
            Tiger tiger = (Tiger) animal;
            tiger.climbTree();
        }
    }
}
