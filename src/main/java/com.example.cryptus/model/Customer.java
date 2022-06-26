package com.example.cryptus.model;

import com.example.cryptus.dao.transfer.RegisterDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Date;

public class Customer extends User {


    private Date birthDate;
    private String BSN;
    private String city;
    private String Street;
    private int houseNumber;
    private String email;
    private String postcode;
    private int phone;

    //Daan: I made a logger
    private final Logger logger = LoggerFactory.getLogger(Customer.class);


    public Customer(int userid, String firstName, String preposition, String lastName, Date birthDate, String BSN,String Street, int houseNumber,String postcode, String city, String email, int phone, String userName, String password, String salt) {
        super(userid,firstName,preposition,lastName,userName,password,salt);
        this.birthDate = birthDate;
        this.houseNumber = houseNumber;
        this.BSN = BSN;
        this.Street=Street;
        this.city = city ;
        this.email=email;
        this.postcode = postcode;
        this.phone = phone;
    }

    //Daan: I made this no-args constructor
    public Customer() {
        super();
        logger.info("Customer created with no-arg constructor");
    }

    //Daan: I made this constructor for registration
    public Customer(String firstName, String preposition, String lastName, String password, String birthDate,
                    String BSN, String city, String street, String houseNumber, String email, String postcode, String phone){
        this(0, firstName, preposition, lastName, null, password, null, birthDate, BSN, city, street, houseNumber, email, postcode, phone);
    }

    //Daan: I made this constructor for registration
    public Customer(RegisterDto registerDto) {
        this(registerDto.getFirstName(), registerDto.getPreposition(), registerDto.getLastName(), registerDto.getPassword(),
                registerDto.getBirthDate(), registerDto.getBSN(), registerDto.getCity(), registerDto.getStreet(),
                registerDto.getHouseNumber(), registerDto.getEmail(), registerDto.getPostcode(), registerDto.getPhone());
    }
    public int getUserId() {
        return super.getUserId();
    }

    public void setUserId(int userId) {
        super.setUserId(userId);
    }

    public String getFirstName() {
        return super.getFirstName();
    }

    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    public String getPreposition() {
        return super.getPreposition();
    }

    public void setPreposition(String preposition) {
        super.setPreposition(preposition);
    }

    public String getLastName() {
        return super.getLastName();
    }

    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    public String getUserName() {
        return super.getUserName();
    }

    public void setUserName(String userName) {
        super.setUserName(userName);
    }

    public String getPassword() {
        return super.getPassword();
    }

    public void setPassword(String password) {
        super.setPassword(password);
    }

    public String getSalt() {
        return super.getSalt();
    }

    public void setSalt(String salt) {
        super.setSalt(salt);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBSN() {
        return BSN;
    }

    public void setBSN(String BSN) {
        this.BSN = BSN;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return     super.toString()+
                " birthDate=" + birthDate +
                ", BSN='" + BSN + '\'' +
                ", city='" + city + '\'' +
                ", Street='" + Street + '\'' +
                ", houseNumber=" + houseNumber +
                ", email='" + email + '\'' +
                ", postcode='" + postcode + '\'' +
                ", phone=" + phone +
                '}';
    }
}
