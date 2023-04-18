package com.example.caculatorutil;

public class Order {
    private String id;
    private int cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Order(String id, int cost) {
        this.id = id;
        this.cost = cost;
    }
}
