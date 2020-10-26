package com.pizzabff.projectbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue()
    private Long Id;

//    @Column(name = "password")
//    private final String password;

    @Column(name = "name")
    private String Name;

//    public User(String username, String password) {
//        this.Name = username;
//        this.password = password;
//    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
