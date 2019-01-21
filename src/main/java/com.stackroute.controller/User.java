package com.stackroute.controller;

public class User {
    private String user;
    DataConnection databaseconnection = new DataConnection();
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        databaseconnection.insertData(this.username,this.password);
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

    private String username;
    private String password;





//    //public String getUser() {
//        return user;
//    }
//
//    public void setUser(String user) {
//        this.user = user;
//    }
}
