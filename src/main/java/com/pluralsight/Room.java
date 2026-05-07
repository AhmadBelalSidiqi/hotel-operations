package com.pluralsight;

public class Room {
    private final String roomType;
    private final int numberOfBeds;
    private final double price;
    boolean isDirty;
    boolean isOccupied;

    public Room(String roomType, int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        this.isOccupied = false;
        if (roomType.equalsIgnoreCase("king")) {
            this.roomType="king";
            this.price = 134;
        } else {
            this.roomType = "double";
            this.price=124;
        }
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
        return !isOccupied && !isDirty;
    }

    public String getRoomType() {
        return roomType;
    }

    public void checkedIn() {
        this.isOccupied = true;
        this.isDirty = true;
    }
    public void checkOut(){
        this.isOccupied = false;
        this.isDirty = true;
    }
    public void cleanRoom(){
        this.isDirty = false;
    }
}
