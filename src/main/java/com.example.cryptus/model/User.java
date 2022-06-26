package com.example.cryptus.model;

import com.example.cryptus.dao.transfer.RegisterDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class User {

    //Daan: I made a logger
    private final Logger logger = LoggerFactory.getLogger(User.class);

    private int userId;
    private String firstName;
    private String preposition;
    private String lastName;
    private String userName;
    private String password;
    private String salt;
    List<Transaction> transactionList;

    public User(int userId, String firstName, String preposition, String lastName, String userName, String password, String salt) {
        this.userId = userId;
        this.firstName = firstName;
        this.preposition = preposition;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.salt = salt;
    }

    //Daan: I created this no-args constructor
    public User() {
        super();
        logger.info("User created with no-args constructor");
    }

    //Daan: I created this constructor for registration
    public User(String firstName, String preposition, String lastName, String password) {
        this(0, firstName, preposition, lastName, null, password, null);
    }

    //Daan: I created this constructor for registration
    public User(RegisterDto registerDto) {
        this(registerDto.getFirstName(), registerDto.getPreposition(), registerDto.getLastName(), registerDto.getPassword());
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPreposition() {
        return preposition;
    }

    public void setPreposition(String preposition) {
        this.preposition = preposition;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }



   /* public User(int userId, String firstName, String preposition, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.preposition = preposition;
        this.lastName = lastName ;
    }*/

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", preposition='" + preposition + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'';
    }
}
