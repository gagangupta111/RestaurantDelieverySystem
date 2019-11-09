package com.airtel.restaurantDelieverySystem.entity;

public enum Status {
    ACCEPTED("ACCEPTED", 40),
    PREPARING("PREPARING", 30),
    DELIVERING("DELIVERING", 20),
    DELIVERED("DELIVERED", 0),

    CANCELLED("CANCELLED", -401);

    private final String STATUS;
    private final int timeToDeliever;

    Status(String STATUS, int timeToDeliever) {
        this.STATUS = STATUS;
        this.timeToDeliever = timeToDeliever;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public int getTimeToDeliever() {
        return timeToDeliever;
    }
}
