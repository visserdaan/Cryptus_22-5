package com.example.cryptus.dao.transfer;

import com.example.cryptus.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Member;

public class RegisterDto {

    String firstName;
    String preposition;
    String lastName;
    String password;
    String birthDate; //I can't use Date with JSON, need to convert somewhere
    String BSN;
    String city;
    String street;
    String houseNumber; //int or String?
    String email;
    String postcode;
    String phone; //int or String?

    private final Logger logger = LoggerFactory.getLogger(RegisterDto.class);

//    public RegisterDto(String firstName, String preposition, String lastName, String password,
//                       String birthDate, String BSN, String city, String street, String houseNumber,
//                       String email, String postcode, String phone) {
//        this.firstName = firstName;
//        this.preposition = preposition;
//        this.lastName = lastName;
//        this.password = password;
//        this.birthDate = birthDate;
//        this.BSN = BSN;
//        this.city = city;
//        this.street = street;
//        this.houseNumber = houseNumber;
//        this.email = email;
//        this.postcode = postcode;
//        this.phone = phone;
//    }

    public RegisterDto(Customer customer, boolean includePassword) {
        super();
        this.firstName = customer.getFirstName();
        this.preposition = customer.getPreposition();
        this.lastName = customer.getLastName();
        this.password = includePassword ? customer.getPassword() : "";
        this.birthDate = customer.getBirthDate();
        this.BSN = customer.getBSN();
        this.city = customer.getCity();
        this.street = customer.getStreet();
        this.houseNumber = customer.getHouseNumber();
        this.email = customer.getEmail();
        this.postcode = customer.getPostcode();
        this.phone = customer.getPhone();
    }

    public RegisterDto() {
        super();
        logger.info("Member created with no-arg constructor");
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
