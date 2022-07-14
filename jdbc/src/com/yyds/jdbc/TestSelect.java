package com.yyds.jdbc;

import com.yyds.jdbc2.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //调用后台获取数据
        List<Employee> empList = findAll();
        //在前台遍历数据
        empList.forEach((emp -> System.out.println(emp)));
    }
    //后台项目
    public static List<Employee> findAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Employee> list = new ArrayList<>();
        int n=0;
        try {
            //添加驱动jar包到项目的classpath下
            //1.加载驱动
            String driverClassName = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/yyds?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
            String user = "root";
            String password = "123456";
            Class.forName(driverClassName);
            //2.和数据库建立连接
            conn = DriverManager.getConnection(url, user, password);
            //3.创建发送sql命令的发送器
            stmt = conn.createStatement();
            //4.使用sql命令发送器发送SQL命令并得到结果
            String sql = "select * from emp order by sal desc ";
//        int n = stmt.executeUpdate(sql);
            rs = stmt.executeQuery(sql);
            //5.处理结果
            while (rs.next()) {//指向下一行,true 有数据,false 没有数据
                int empno = rs.getInt("empno");
                String ename = rs.getString("ENAME");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hireDate = rs.getDate("hiredate");
                double sal = rs.getDouble("sal");
                double comm = rs.getDouble("comm");
                int deptno = rs.getInt("deptno");
                //将当前行数据封装到一个Employee对象中
                Employee employee = new Employee(empno, ename, job, mgr, hireDate, sal, comm, deptno);
                //将Employee对象加入list
                list.add(employee);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
           // 6.关闭资源
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
