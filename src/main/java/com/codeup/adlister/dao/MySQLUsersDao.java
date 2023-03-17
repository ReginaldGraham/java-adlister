package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{
    private Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public User findByUsername(String username) {
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM users WHERE username=?");
            stmt.setString(1,username);
           ResultSet rs= stmt.executeQuery();
                   if(rs.next()) {
                       return new User(
                               rs.getLong("id"),
                               rs.getString("username"),
                               rs.getString("email"),
                               rs.getString("password")
                       );
                   }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Void insert(User user) {
            User newUser=new User(user.getUsername(), user.getEmail(), user.getPassword());
        try {
//            CREATE USER
            PreparedStatement stmt = connection.prepareStatement("INSERT  INTO users(username,email,password) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1,newUser.getUsername());
            stmt.setString(2,newUser.getEmail());
            stmt.setString(3,newUser.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
        return null;
    }



}
