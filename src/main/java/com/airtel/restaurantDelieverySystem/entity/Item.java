package com.airtel.restaurantDelieverySystem.entity;

import java.util.concurrent.atomic.AtomicLong;

public class Item {

    public static String BURGER = "BURGER";
    public static String SANDWICH = "SANDWICH";

    private static final AtomicLong count = new AtomicLong(0);
    private Long itemID;
    private String name = "";

    public Item(String name) {
        this.name = name;
        itemID = count.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getItemID() {
        return itemID;
    }
}
