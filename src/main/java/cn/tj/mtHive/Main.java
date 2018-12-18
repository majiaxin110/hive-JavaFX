//package cn.tj.mtHive;
//
//import java.sql.*;
//
///**
// * @author MT
// * @version 0.1
// */
//public class Main {
//    private static String driverName = "org.apache.hive.jdbc.HiveDriver";
//
//
//    static public void main(String[] args) throws SQLException {
//        System.out.println("Start");
//        try {
//            Class.forName(driverName);
//        }  catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            System.exit(1);
//        }
//        Connection con = DriverManager.getConnection("jdbc:hive2://192.168.119.135:2333/default"
//                ,"hive","hive");
//        Statement statement = con.createStatement();
//        String tableName = "students";
//////        statement.execute("drop table if exists " + tableName);
//////        statement.execute("create table " + "ff" + " (key int, value string)");
//        String sql = "";
////        System.out.println("Running " + sql);
////        ResultSet res = statement.executeQuery(sql);
////        if(res.next()) {
////            System.out.println(res.getString(1));
////        }
//        ResultSet res;
////        sql = "insert into table " + "saleHistory" + " VALUES ('18004752','2018-12-07 12:34:56.1','17944104','100001')";
////        System.out.println("Running " + sql);
////        statement.execute(sql);
////        if(res.next()) {
////            System.out.println(res.getString(1));
////        }
//
//        sql = "select * from " + "goods";
//        res = statement.executeQuery(sql);
//        System.out.println("Running " + sql);
//        while (res.next()) {
////            System.out.println(res.getString("storeid") + "  name:" + res.getString("name")
////                    + "  loc:" + res.getString("location"));
//            System.out.println(res.getString("goodsid") + "  " + res.getString("name"));
//        }
//
//    }
//}
