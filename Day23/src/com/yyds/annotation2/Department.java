package com.yyds.annotation2;

import java.io.Serializable;
import java.util.Objects;
@Table(value = "dept")
public class Department implements Serializable {
    private static final long serialVersionUID = 4278725638881339321L;
    @Column(columnName = "deptno",columnType = "int")
    private Integer deptNo;//部门编号
    @Column(columnName = "dename",columnType = "varchar",length = 14)
    private String deptName;//部门名称
    @Column(columnName = "loc",columnType = "varchar")
    private String location;//部门地址

    public Department() {
    }

    public Department(Integer deptNo, String deptName, String location) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.location = location;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(deptNo, that.deptNo) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptNo, deptName, location);
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
