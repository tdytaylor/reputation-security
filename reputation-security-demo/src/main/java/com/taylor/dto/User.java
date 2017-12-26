package com.taylor.dto;

public class User {

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
