package com.airtel.restaurantDelieverySystem.entity;

import java.util.concurrent.atomic.AtomicLong;

public class Order {

    public static String ACCEPTED = "ACCEPTED";
    public static String IN_PROCESS = "IN_PROCESS";
    public static String DELIVERED = "DELIVERED";

    private static final AtomicLong count = new AtomicLong(0);
    private Long orderID;
    private Status status;

    private Item item;
    private int noOfItems;

    public Order(Status status, Item item, int noOfItems) {
        this.status = status;
        this.item = item;
        this.noOfItems = noOfItems;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getOrderID() {
        return orderID;
    }

    public Item getItem() {
        return item;
    }

    public int getNoOfItems() {
        return noOfItems;
    }
}
