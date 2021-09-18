package com.example.demo1.service;

public class User {
    private long id;
    private String password;
    private String email;
    private String name;
    public User() {
    }
    public User(long id,String password,String email,String name){
        this.id = id;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }
    public String getEmail(){
        return this.email;
    }

    public String getName() {
        return name;
    }
}
