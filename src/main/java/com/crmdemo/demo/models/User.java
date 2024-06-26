package com.crmdemo.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@ToString @EqualsAndHashCode
public class User {

    @Id
    @Getter @Setter @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "firstName")
    private String firstName;
    @Getter @Setter @Column(name = "lastName")
    private String lastName;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "phone")
    private String phone;
    @Getter @Setter @Column(name = "password")
    private String password;
}
