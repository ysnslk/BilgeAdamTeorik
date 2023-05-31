package com.yasinsolak.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "kullanici")
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    @OneToMany(mappedBy = "kullanici")
    private List<Yarisma> yarismaList;

    public Kullanici(Long id, String username, String password, String name, String surname, String email, List<Yarisma> yarismaList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.yarismaList = yarismaList;
    }

    public Kullanici(String username, String password, String name, String surname, String email, List<Yarisma> yarismaList) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.yarismaList = yarismaList;
    }

    public Kullanici(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Kullanici() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Yarisma> getYarismaList() {
        return yarismaList;
    }

    public void setYarismaList(List<Yarisma> yarismaList) {
        this.yarismaList = yarismaList;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", surname=" + surname + ", email=" + email + ", yarismaList=" + yarismaList + '}';
    }
    
    
}
