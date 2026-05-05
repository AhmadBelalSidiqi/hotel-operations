package com.pluralsight;

public class Reservation {
    private Room room;
    private final double price;
    private int numberOfNight;
    private boolean isWeekend;
    private final double reservationTotal;



    public Reservation(Room room, int numberOfNight) {
        this.room = room;
        this.numberOfNight = numberOfNight;
        this.isWeekend = false;
        price = this.room.getPrice();
        this.reservationTotal = numberOfNight*price;
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public double getReservationTotal() {
        if (isWeekend)
            return (numberOfNight*price)* 1.10;
        return numberOfNight*price;
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return this.room.getRoomType();
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public void setIsWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}
