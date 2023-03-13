package com.example.spinner;

public class Orderinfo {

    int id;
    String email,country,state,city,gender,chaque,payment;

    public Orderinfo(int id, String email, String country, String state, String city, String gender, String chaque, String payment) {
        this.id = id;
        this.email = email;
        this.country = country;
        this.state = state;
        this.city = city;
        this.gender = gender;
        this.chaque = chaque;
        this.payment = payment;
    }

    public Orderinfo(String email, String country, String state, String city, String gender, String chaque, String payment) {
        this.email = email;
        this.country = country;
        this.state = state;
        this.city = city;
        this.gender = gender;
        this.chaque = chaque;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getChaque() {
        return chaque;
    }

    public void setChaque(String chaque) {
        this.chaque = chaque;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
