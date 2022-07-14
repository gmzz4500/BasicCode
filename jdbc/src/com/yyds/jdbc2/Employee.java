package com.yyds.jdbc2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Employee implements Serializable {
    private static final long serialVersionUID = -7042681622948296674L;
    private int empno;
    private String ename;
    private String job;
    private int mar;
    private Date hireDate;
    private Double sal;
    private double comm;
    private int deptno;

    public Employee() {
    }

    public Employee(int empno, String ename, String job, int mar, Date hireDate, Double sal, double comm, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mar = mar;
        this.hireDate = hireDate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMar() {
        return mar;
    }

    public void setMar(int mar) {
        this.mar = mar;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empno == employee.empno &&
                mar == employee.mar &&
                Double.compare(employee.comm, comm) == 0 &&
                deptno == employee.deptno &&
                Objects.equals(ename, employee.ename) &&
                Objects.equals(job, employee.job) &&
                Objects.equals(hireDate, employee.hireDate) &&
                Objects.equals(sal, employee.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, ename, job, mar, hireDate, sal, comm, deptno);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mar=" + mar +
                ", hireDate=" + hireDate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }

}
