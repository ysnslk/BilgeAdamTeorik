package com.yasinsolak.repository;

import com.yasinsolak.entity.User;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserRepositoryImpl {
    
    private  Connection conn;

    public UserRepositoryImpl() {
        try {
            Driver.class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/MusteriTakipDB";
            String username = "postgres";
            String password = "123456789";
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("Bağlantı Hatası Oluştu"+ex.toString());
        }
    }

    public void save(User user) {
        
        String sql = "insert into tbluser(username , pwd ,email) values ('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getEmail()+"')";
        try {
            PreparedStatement preparedStatement = conn.prepareCall(sql);
            preparedStatement.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("SQL Hata"+ex.toString());
        }
        catch(Exception ex){
            System.out.println("Bilinmeyen bir hata"+ex.toString());
        }
    }

    public void update() {
    }

    public void delete() {
    }

    public void findAll() {
    }

}
