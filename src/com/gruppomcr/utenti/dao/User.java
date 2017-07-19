package com.gruppomcr.utenti.dao;

/**
 * Created by Admin on 19/07/2017.
 */
public class User {

    private long userId;

    private String userName;

    private String userAddress;

    private String userEmail;

    public User(){

    }
    public User(long userId, String userName, String userAddress, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}