package com.lace;
import javax.xml.transform.Result;
import java.sql.*;

public class database {
    private static final String url = "jdbc:mysql://192.168.145.148:3306/lace";
    private static final String user = "lace";
    private static final String password = "980308";
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM member WHERE name =?");
        stmt.setObject(1, "周子钦");
        ResultSet result = stmt.executeQuery();
        while (result.next()) {
            long id = result.getLong(1);
            String name = result.getString(2);
            int gender = result.getInt(3);
            System.out.println("人员信息按照id排序输出," + "id: " + id + " name: " + name + " gender: " + gender);
        }
        con.close();
    }
}
