package com.pluralsight;


public class Reservation {
    private final Room room;
    private int numberOfNight;
    private boolean isWeekend;
    private final double reservationTotal;
    private final String roomType;




    public Reservation(Room room, int numberOfNight) {
        this.room = room;
        this.roomType = this.room.getRoomType();
        this.numberOfNight = numberOfNight;
        this.isWeekend = false;
        double price = this.room.getPrice();
        this.reservationTotal = numberOfNight* price;
        this.room.checkedIn();
        this.room.isDirty=true;
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public double getReservationTotal() {
        if (isWeekend)
            return reservationTotal * 1.10;
        return reservationTotal;
    }

    public double getPrice() {
        return this.room.getPrice();
    }

    public String getRoomType() {
        return this.roomType;
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
