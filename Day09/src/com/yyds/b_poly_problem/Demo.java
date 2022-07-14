package com.yyds.b_poly_problem;

public class Demo {
    public static void main(String[] args) {
        Dog a1 = new Dog();
        useAnimal(a1);
        Cat a2 = new Cat();
        useAnimal(a2);
        Tiger a3 = new Tiger();
        useAnimal(a3);
    }
    public static void useAnimal(Animal animal){
        animal.eat();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.lookHome();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        if(animal instanceof Tiger){
            Tiger tiger = (Tiger) animal;
            tiger.climbTree();
        }
    }
}
