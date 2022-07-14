package com.yyds.annotation;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Student implements Comparable<Student>, Serializable {
    private static final long serialVersionUID = 1505570458425654801L;
    private Integer sno;
    private String sname;
    private Double score;

    public Student() {
    }

    public Student(Integer sno, String sname, Double score) {
        this.sno = sno;
        this.sname = sname;
        this.score = score;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sno, student.sno) &&
                Objects.equals(sname, student.sname) &&
                Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, sname, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.sno - o.sno;
    }
    @Deprecated
    public void sleep(){
        System.out.println("-----sleep-----");
    }
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Student stu = new Student();
        stu.sleep();
        Date date = new Date();
        System.out.println(date.toLocaleString());
    }
}
