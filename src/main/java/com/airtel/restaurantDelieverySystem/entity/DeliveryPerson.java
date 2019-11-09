package com.airtel.restaurantDelieverySystem.entity;

import java.util.concurrent.atomic.AtomicLong;

public class DeliveryPerson {

    public static String ACTIVE = "ACTIVE";
    public static String NON_ACTIVE = "NON_ACTIVE";

    private static final AtomicLong count = new AtomicLong(0);
    private Long personID;
    private String status = "";
    private Order order;

    public DeliveryPerson(String status, Order order) {
        this.status = status;
        this.order = order;
    }

    public DeliveryPerson(Order order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
