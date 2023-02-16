package com.example.springapi.api.model;

public class User {

    private int id;
    private String userName;
    private int userLevel;
    private String userClass;
    private String email;

    public User(int id, String userName, int userLevel, String userClass, String email) {
        this.id = id;
        this.userName = userName;
        this.userLevel = userLevel;
        this.userClass = userClass;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}