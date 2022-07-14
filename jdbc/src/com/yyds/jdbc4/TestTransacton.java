package com.yyds.jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransacton {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        int n=0;
        try{
            //0.添加驱动jar到项目的classpath下
            //1.加载驱动
            String driverClassName ="com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
            String user = "root";
            String password = "root";
            Class.forName(driverClassName);//?
            //2.和数据库建立连接
            conn = DriverManager.getConnection(url,user,password);
            //3.创建发送SQL命令的发送器(手枪)
            stmt = conn.createStatement();

            //事务改为手动提交
            conn.setAutoCommit(false);

            stmt.executeUpdate("update account set balance = balance - 1000 where id = 1");
            int i = 10/0;
            stmt.executeUpdate("update account set balance = balance + 1000 where id = 2");
            //手动提交事务,事务结束
            conn.commit();
        }catch(Exception e){
            e.printStackTrace();
            //手动的回滚事务
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            //6.关闭资源
            try {
                if(stmt !=null){
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

    }

}
