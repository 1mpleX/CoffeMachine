package com.dnldubinkin.spring.springboot.dto;

public class CoffeeOrderRequest {

    private String coffeeType;

    public CoffeeOrderRequest() {
    }

    public CoffeeOrderRequest(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }
}