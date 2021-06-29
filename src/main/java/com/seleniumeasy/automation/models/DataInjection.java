package com.seleniumeasy.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("en-US"));
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String zipcode;
    private String webdomain;
    private String coment;

    public String getName(){
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getZipcode(){
        return zipcode;
    }
    public String getWebdomain(){
        return webdomain;
    }
    public String getComent(){
        return coment;
    }
    public DataInjection(){
        this.name = faker.name().firstName();
        this.lastname = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.phone = faker.phoneNumber().phoneNumber();
        this.address = faker.address().fullAddress();
        this.city = faker.address().city();
        this.zipcode = faker.address().zipCode();
        this.webdomain = faker.internet().domainWord();
        this.coment = faker.lorem().paragraph();
    }
}
