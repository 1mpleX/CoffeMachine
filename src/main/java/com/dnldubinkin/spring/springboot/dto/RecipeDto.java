package com.dnldubinkin.spring.springboot.dto;

public class RecipeDto {

    private String name;
    private int water;
    private int coffeeBeans;
    private int milk;

    public RecipeDto() {
    }

    public RecipeDto(String name, int water, int coffeeBeans, int milk) {
        this.name = name;
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }
}