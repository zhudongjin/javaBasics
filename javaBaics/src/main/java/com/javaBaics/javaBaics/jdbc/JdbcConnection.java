package com.javaBaics.javaBaics.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {



    public static void main(String[] args) {
        Connection connection1 = null ;
        Connection connection2 = null ;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection1 = DriverManager.getConnection("jdbc:mysql://139.199.250.231:1307/hstypay", "dbsearch", "LShg843yh$f8!K");
            connection2 = DriverManager.getConnection("jdbc:mysql://139.199.250.231:1307/hstypay", "dbsearch", "LShg843yh$f8!K");
            Statement statement = connection1.createStatement();
            Statement statement2 = connection2.createStatement();
            //查询角色编码
            ResultSet resultSet = statement.executeQuery("select distinct t.role_id,t.func_id,t.app_id from auth_role_permission t where t.func_id in (select ap.func_id from auth_permission ap where ap.func_id in(select o.func_id from auth_func o where o.func_code = 'CREATE-QRCODE') and ap.permission_code in('ADD','UPDATE','UPLOAD')) and t.permission_code in('ADD','UPDATE','UPLOAD')");
            while(resultSet.next()){
                String func_id= resultSet.getString("func_id");
                String role_id= resultSet.getString("role_id");
                String app_id= resultSet.getString("app_id");
                //根据权限编码查询出对应的菜单权限
                ResultSet resultSet2 = statement2.executeQuery("select t.* from auth_role_permission t  where t.func_id ="+func_id+" and t.role_id ="+role_id+" and t.permission_code in('ADD','UPDATE','UPLOAD')");
                int index = 0;
                while(resultSet2.next()){
                    String permission_code = resultSet2.getString("permission_code");
                    //如果存在上传权限就不生成脚本
                    if(permission_code.equals("UPLOAD")){
                        index ++ ;
                    }
                }
                //index等于0生成脚本
                if(index ==0 ){
                    System.out.println("INSERT INTO `hstypay`.`auth_role_permission`(`role_id`, `func_id`, `app_id`, `permission_code`, `create_time`) VALUES ("+role_id+", "+func_id+", "+app_id+", 'UPLOAD', now());");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
