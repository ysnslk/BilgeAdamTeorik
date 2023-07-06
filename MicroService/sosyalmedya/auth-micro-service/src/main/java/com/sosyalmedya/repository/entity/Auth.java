package com.sosyalmedya.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tblauhth")
@Entity
public class Auth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 64 ,unique = true, nullable = false)
    String username;
    @Column(length = 64 ,nullable = false)
    String password;
    String email;
    int state;
    Long createat;
    Long updateate;
}
