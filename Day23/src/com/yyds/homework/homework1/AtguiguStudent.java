package com.yyds.homework.homework1;

import java.io.Serializable;
import java.util.Objects;

public class AtguiguStudent implements Comparable<AtguiguStudent>,Serializable {
    static final long serialVersionUID = 3797733017184477064L;
    private static String school;
    private String className;

    public AtguiguStudent() {
    }

    public AtguiguStudent(String className) {
        this.className = className;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        AtguiguStudent.school = school;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtguiguStudent that = (AtguiguStudent) o;
        return Objects.equals(className, that.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className);
    }

    @Override
    public String toString() {
        return "AtguiguStudent{" +
                "className='" + className + '\'' +
                '}';
    }

    @Override
    public int compareTo(AtguiguStudent o) {
        return this.className.compareTo(o.getClassName());
    }
}
