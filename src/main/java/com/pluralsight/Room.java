package com.pluralsight;

public class Room {
    private final String roomType;
    private final int numberOfBeds;
    private final double price;
    boolean isDirty;
    boolean isOccupied;

    public Room(String roomType, int numberOfBeds) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        if (roomType.equalsIgnoreCase("king")) {
            this.price = 134;
        } else {
            this.price=124;
        }
        isDirty=false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public String getRoomType() {
        return roomType;
    }
}
