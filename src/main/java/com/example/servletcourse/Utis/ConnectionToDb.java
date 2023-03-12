package com.example.servletcourse.Utis;

import java.sql.*;

public class ConnectionToDb {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            final String dbUrl = "jdbc:mysql://localhost:3306/user"; //3306 port mặt định db
            final String userName = "root";
            final String password = "Ducvc123123!@#$%";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(dbUrl, userName, password);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
}
//    public static void getData(Connection c) throws SQLException {
//        String sql = "select * from quanlyuser";
//        Statement statement = c.createStatement(); //truy vấn
//        ResultSet resultSet =  statement.executeQuery(sql); // trả về recored or rs
//        while (resultSet.next()) {
//            String name = resultSet.getString("name");
//            String password = resultSet.getString("password");
//            String email = resultSet.getString("email");
//        }
//        statement.close();
//        resultSet.close();
//        c.close();
//    }
//
//    public static void insertData(Connection c) throws SQLException {
//        String sql = "Insert Into quanlyuser (name, password, email) values (?,?,?)";
//        PreparedStatement st = c.prepareStatement(sql);
//        st.setString(1, "Anh");
//        st.setString(2, "avsàdasdffgc22");
//        st.setString(3, "xxxx@gmail.com");
//        st.executeUpdate();
//    }
//
//    public static void deleteData(Connection c,Integer id) throws SQLException {
//        String sql = "DELETE FROM quanlyuser WHERE id = "+id;
//        PreparedStatement st = c.prepareStatement(sql);
//        int rowsDeleted = st.executeUpdate(sql);
//        if (rowsDeleted > 0) {
//            System.out.println("A user was deleted successfully!");
//        }
//    }
//
//    public static void updateData(Connection c) throws SQLException {
//        String sql = "UPDATE quanlyuser SET name = ? , password = ?, email = ? Where ID = 5";
//        PreparedStatement st = c.prepareStatement(sql);
//        st.setString(1, "Khoa");
//        st.setString(2, "ádfasdf");
//        st.setString(3, "adsf@gmail.com");
//        st.executeUpdate();
//    }
//
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//      Connection connection = new ConnectionToDb().getConnection();
//      //insertData(connection);
//      //deleteData(connection,6);
//        System.out.println("==========");
//      updateData(connection);
//      getData(connection);
//
//    }





