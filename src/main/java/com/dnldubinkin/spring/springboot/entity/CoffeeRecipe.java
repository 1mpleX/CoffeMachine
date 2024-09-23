package com.dnldubinkin.spring.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "coffee_recipe")
public class CoffeeRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "water")
    private int water;

    @Column(name = "coffee_beans")
    private int coffeeBeans;

    @Column(name = "milk")
    private int milk;

    public CoffeeRecipe() {
    }

    public CoffeeRecipe(String name, int water, int coffeeBeans, int milk) {
        this.name = name;
        this.water = water;
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "CoffeeRecipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", water=" + water +
                ", coffeeBeans=" + coffeeBeans +
                ", milk=" + milk +
                '}';
    }
}