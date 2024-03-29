package com.yasinsolak.repository;

import com.yasinsolak.entity.User;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserRepositoryImpl {

    public Optional<Connection> openConnection() {
        Connection conn = null;
        try {
            Driver.class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/MusteriTakipDB";
            String username = "postgres";
            String password = "123456789";
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("Bağlantı Hatası Oluştu" + ex.toString());
        }
        return Optional.of(conn);
    }

    public UserRepositoryImpl() {

    }

    public void save(User user) {
        Optional<Connection> conn = openConnection();
        if (conn.isPresent()) {
            String sql = "insert into tbluser(username , pwd ,email) values ('" + user.getUsername() + "','" + user.getPassword() + "','" + user.getEmail() + "')";
            try {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                preparedStatement.executeUpdate();
                conn.get().close();
            } catch (SQLException ex) {
                System.out.println("SQL Hata" + ex.toString());
            } catch (Exception ex) {
                System.out.println("Bilinmeyen bir hata" + ex.toString());
            }
        }

    }

    public void update() {
    }

    public void delete() {
    }

    public void findAll() {
    }

    public boolean isUser(String username, String password) {
        Optional<Connection> conn = openConnection();
        if (conn.isPresent()) {
            String sql = "Select * from tbluser where username ='" + username + "' and pwd ='" + password + "'";
            ResultSet resultSet;
            try {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                resultSet = preparedStatement.executeQuery();
                boolean result =  resultSet.next();
                conn.get().close();
                return result;

            } catch (SQLException ex) {
                Logger.getLogger(UserRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }

}
