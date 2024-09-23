package com.dnldubinkin.spring.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "statistics")
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "coffee_type")
    private String drinkName;

    @Column(name = "count")
    private long orderCount;

    public Statistics() {
    }

    public Statistics(String drinkName, long orderCount) {
        this.drinkName = drinkName;
        this.orderCount = orderCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(long orderCount) {
        this.orderCount = orderCount;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "id=" + id +
                ", drinkName='" + drinkName + '\'' +
                ", orderCount=" + orderCount +
                '}';
    }
}