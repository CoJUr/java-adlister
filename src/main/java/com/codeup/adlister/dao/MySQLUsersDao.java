package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("MySQLUsersDao: Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        User user = null; //        placeholder user obj

        String query = "SELECT * FROM users where username = ?";


        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                user = new User(rs.getLong("id"), rs.getString("username"),
                        rs.getString("email"), rs.getString("password"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error from mySQLUsersDao findByUsername(): ", e);
        }
        return user;
    }

    @Override
    public Long insert(User user) {
        String query = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
        try {
            PreparedStatement preppedStmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preppedStmt.setString(1, user.getUsername());
            preppedStmt.setString(2, user.getEmail());
            preppedStmt.setString(3, user.getPassword());
            preppedStmt.executeUpdate();
            ResultSet rs = preppedStmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("AdsDao insert ad(): Error creating a new ad. ", e);
        }
    }


    public static void main(String[] args) {
        Users usersDao = new MySQLUsersDao(new Config());
        System.out.println(usersDao.findByUsername("frylock"));

        User newUser = new User(
                "player1",
                "playon@playa.com",
                "password"
        );
        usersDao.insert(newUser);
        System.out.println(usersDao.findByUsername("player1"));
    }
}
