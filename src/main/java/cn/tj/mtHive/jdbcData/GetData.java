package cn.tj.mtHive.jdbcData;

import java.sql.*;

/**
 * @author MT
 * @version 0.1
 */
public class GetData {
    private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    private static String connectionStr = "jdbc:hive2://192.168.119.135:2333/default";
    private static String connectionUser = "hive";
    private static String connectionPwd = "hive";

    public static boolean testConn() {
        try {
            Class.forName(driverName);
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        try {
            Connection con = DriverManager.getConnection(connectionStr,connectionUser,connectionPwd);
            Statement statement = con.createStatement();
            String sql = "";
            ResultSet res;
            sql = "select * from " + "saleHistory";
            res = statement.executeQuery(sql);
            if(res.next()) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
