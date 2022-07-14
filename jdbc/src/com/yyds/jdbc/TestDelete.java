package com.yyds.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
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
        String sql = "delete from dept where deptno = 50";
        int n = stmt.executeUpdate(sql);
        //5.处理结果
        if(n>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        //6.关闭资源
        stmt.close();
        conn.close();
    }
}
