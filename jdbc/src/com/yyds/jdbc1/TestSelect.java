package com.yyds.jdbc1;

import java.sql.*;

public class TestSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //添加驱动jar包到项目的classpath下
        //1.加载驱动
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/yyds?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
        String user = "root";
        String password = "123456";
        Class.forName(driverClassName);
        //2.和数据库建立连接
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.创建发送sql命令的发送器
        Statement stmt = conn.createStatement();
        //4.使用sql命令发送器发送SQL命令并得到结果
        String sql = "select * from emp";
//        int n = stmt.executeUpdate(sql);
        ResultSet rs = stmt.executeQuery(sql);
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
            //输出各个字段的值
            System.out.println(empno+"\t"+ename+"\t"+job+"\t"+mgr+"\t"+hireDate+"\t"+sal+"\t"+comm+"\t"+deptno);
        }

        //6.关闭资源
        stmt.close();
        conn.close();
    }
}
