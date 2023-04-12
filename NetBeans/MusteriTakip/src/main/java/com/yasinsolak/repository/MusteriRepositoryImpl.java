package com.yasinsolak.repository;

import com.yasinsolak.entity.Musteri;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MusteriRepositoryImpl {

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

    public void save(Musteri musteri) {

        Optional<Connection> conn = openConnection();
        if (conn.isPresent()) {
            String sql = "insert into tblmusteri (ad,adres,telefon,avatar,state)"
                    + " values('" + musteri.getAd() + "','" + musteri.getAdres() + "','" + musteri.getTelefon() + "','" + musteri.getAvatar() + "'," + musteri.getState() + ")";
            try {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                preparedStatement.executeUpdate();
                conn.get().close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }

        }
    }

    public void update(Musteri musteri) {

        Optional<Connection> conn = openConnection();
        if (conn.isPresent()) {
            String sql = "update tblmusteri set ad= '" + musteri.getAd() + "' ,adres = '" + musteri.getAdres() + "',telefon = '" + musteri.getTelefon() + "',avatar = '" + musteri.getAvatar() + "',state =" + musteri.getState() + " where id =" + musteri.getId();
            try {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                preparedStatement.executeUpdate();
                conn.get().close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }

        }
    }

    public void delete(Long id) {

        Optional<Connection> conn = openConnection();
        if (conn.isPresent()) {
            String sql = "delete from tblmusteri where id =" + id;
            try {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                preparedStatement.executeUpdate();
                conn.get().close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }

        }
    }

    public List<Musteri> findAll() {
        List<Musteri> mlist = new ArrayList<>();
        Optional<Connection> conn = openConnection();
        try {
            String sql = "Select * from tblmusteri";
            if (conn.isPresent()) {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                ResultSet resultset = preparedStatement.executeQuery();
                while (resultset.next()) {
                    Musteri musteri = new Musteri();
                    musteri.setId(resultset.getLong("id"));
                    musteri.setAd(resultset.getNString("ad"));
                    musteri.setAdres(resultset.getNString("adres"));
                    musteri.setAvatar(resultset.getNString("avatar"));
                    musteri.setTelefon(resultset.getNString("telefon"));
                    musteri.setState(resultset.getInt("state"));
                    mlist.add(musteri);
                }
                conn.get().close();
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return mlist;
    }

    public Musteri findById(Long id) {
        Musteri musteri = new Musteri();
        Optional<Connection> conn = openConnection();
        try {
            String sql = "Select * from tblmusteri where id =" + id;
            if (conn.isPresent()) {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                ResultSet resultset = preparedStatement.executeQuery();
                while (resultset.next()) {
                    musteri.setId(resultset.getLong("id"));
                    musteri.setAd(resultset.getNString("ad"));
                    musteri.setAdres(resultset.getNString("adres"));
                    musteri.setAvatar(resultset.getNString("avatar"));
                    musteri.setTelefon(resultset.getNString("telefon"));
                    musteri.setState(resultset.getInt("state"));
                }
                conn.get().close();
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return musteri;
    }

    public List<Musteri> findByAd(String ad) {
        List<Musteri> mlist = new ArrayList<>();
        Optional<Connection> conn = openConnection();
        try {
            String sql = "Select * from tblmusteri where ad like %" + ad + "%";
            if (conn.isPresent()) {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                ResultSet resultset = preparedStatement.executeQuery();
                while (resultset.next()) {
                    Musteri musteri = new Musteri();
                    musteri.setId(resultset.getLong("id"));
                    musteri.setAd(resultset.getNString("ad"));
                    musteri.setAdres(resultset.getNString("adres"));
                    musteri.setAvatar(resultset.getNString("avatar"));
                    musteri.setTelefon(resultset.getNString("telefon"));
                    musteri.setState(resultset.getInt("state"));
                    mlist.add(musteri);
                }
                conn.get().close();
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return mlist;
    }

    public List<Musteri> findByTelefon(String telefon) {
        List<Musteri> mlist = new ArrayList<>();
        Optional<Connection> conn = openConnection();
        try {
            String sql = "Select * from tblmusteri where telefon like %" + telefon + "%";
            if (conn.isPresent()) {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                ResultSet resultset = preparedStatement.executeQuery();
                while (resultset.next()) {
                    Musteri musteri = new Musteri();
                    musteri.setId(resultset.getLong("id"));
                    musteri.setAd(resultset.getNString("ad"));
                    musteri.setAdres(resultset.getNString("adres"));
                    musteri.setAvatar(resultset.getNString("avatar"));
                    musteri.setTelefon(resultset.getNString("telefon"));
                    musteri.setState(resultset.getInt("state"));
                    mlist.add(musteri);
                }
                conn.get().close();
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return mlist;
    }

    public List<Musteri> findByAdres(String adres) {
        List<Musteri> mlist = new ArrayList<>();
        Optional<Connection> conn = openConnection();
        try {
            String sql = "Select * from tblmusteri where adres like %" + adres + "%";
            if (conn.isPresent()) {
                PreparedStatement preparedStatement = conn.get().prepareCall(sql);
                ResultSet resultset = preparedStatement.executeQuery();
                while (resultset.next()) {
                    Musteri musteri = new Musteri();
                    musteri.setId(resultset.getLong("id"));
                    musteri.setAd(resultset.getNString("ad"));
                    musteri.setAdres(resultset.getNString("adres"));
                    musteri.setAvatar(resultset.getNString("avatar"));
                    musteri.setTelefon(resultset.getNString("telefon"));
                    musteri.setState(resultset.getInt("state"));
                    mlist.add(musteri);
                }
                conn.get().close();
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return mlist;
    }
}
