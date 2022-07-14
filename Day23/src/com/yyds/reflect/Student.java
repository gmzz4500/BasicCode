package com.yyds.reflect;

public class Student {
    private int sno;
    private String name;
    public Double score;

    public Student() {
        System.out.println("-----Student()------");
    }

    private Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    public Student(int sno, String name, Double score) {
        this.sno = sno;
        this.name = name;
        this.score = score;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void shout(){
        System.out.println("越磨砺越锋利！！");
    }
    public int  add(int n1,int n2){
        return n1+n2;
    }
    public static void sleep(){
        System.out.println("-----sleep-------");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
