package com.pluralsight;

public class Reservation {
    private Room room;
    private final String roomType = room.getRoomType();
    private final double price = room.getPrice();
    private int numberOfNight;
    private boolean isWeekend;
    private final double reservationTotal;

    public Reservation(Room room, int numberOfNight, boolean isWeekend) {
        this.room = room;
        this.numberOfNight = numberOfNight;
        if (isWeekend){
            this.isWeekend = true;
            //isWeekend increase the total by 10% = 1.10
            this.reservationTotal = (numberOfNight*price)* 1.10;
        } else {
            this.isWeekend = false;
            this.reservationTotal = numberOfNight*price;
        }
    }

    public Reservation(Room room, int numberOfNight) {
        this.room = room;
        this.numberOfNight = numberOfNight;
        this.isWeekend = false;
        this.reservationTotal = numberOfNight*price;
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}
