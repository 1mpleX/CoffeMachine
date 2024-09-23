package com.dnldubinkin.spring.springboot.dto;

public class StatisticsDto {

    private String mostPopularDrink;
    private long totalOrders;

    public StatisticsDto() {
    }

    public StatisticsDto(String mostPopularDrink, long totalOrders) {
        this.mostPopularDrink = mostPopularDrink;
        this.totalOrders = totalOrders;
    }

    public String getMostPopularDrink() {
        return mostPopularDrink;
    }

    public void setMostPopularDrink(String mostPopularDrink) {
        this.mostPopularDrink = mostPopularDrink;
    }

    public long getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(long totalOrders) {
        this.totalOrders = totalOrders;
    }
}