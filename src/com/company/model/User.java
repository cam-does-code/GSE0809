package com.company.model;

import com.company.model.Basket;

public class User {
    private String name;
    private String address;
    private String email;

    private Basket basket;

    public User(String name, String address, String email, Basket basket) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

}
