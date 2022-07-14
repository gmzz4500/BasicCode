package oop;

import java.util.Arrays;
import java.util.Objects;

public class HomeWork1 {
    public static void main(String[] args) {
        Person p1 = new Person("乔峰", 20, "丐帮帮主");
        Person p2 = new Person("虚竹", 19, "灵鹫宫宫主");
        Person p3 = new Person("段誉", 18, "大理太子");
        Person[] p = new Person[]{p1,p2,p3};
        pSort(p);
    }
    public static void pSort(Person[] p) {
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].getAge() > p[j + 1].getAge()) {
                    Person temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
//            Arrays.toString(p);
        }
        System.out.println("Arrays.toString(p) = " + Arrays.toString(p));
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person student = (Person) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(job, student.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, job);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}