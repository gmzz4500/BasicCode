package com.yyds.b_comparable;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double chinese;
    private double math;
    private double english;

    public Person() {
    }

    public Person(String name, int age, double chinese, double math, double english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Double.compare(person.chinese, chinese) == 0 &&
                Double.compare(person.math, math) == 0 &&
                Double.compare(person.english, english) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, chinese, math, english);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ",总分= " + sum() +
                '}';
    }

    public double sum(){
        return chinese + math + english;
    }

    @Override
    public int compareTo(Person o) {
        double result = o.sum() - this.sum();
        result = result == 0 ? o.chinese - this.chinese : result;
        result = result == 0 ? o.math - this.math : result;
        result = result == 0 ? o.english - this.english : result;
        result = result == 0 ? this.name.compareTo(o.name) : result;
        return (int)result;
    }
}
