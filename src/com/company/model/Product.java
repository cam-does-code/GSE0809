package com.company.model;

public class Product {


    public Product(int amount, double price, String description) {
        this.amount = amount;
        this.price = price;
        this.description = description;
    }

    private double price;
    private String description;
    private int amount;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
