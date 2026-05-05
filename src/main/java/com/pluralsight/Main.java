package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Employee alex = new Employee(1,"Alex","frontDest",21,10);
        Room room101 = new Room("king",2);
        Reservation reservationForZoe = new Reservation(room101,10);
        System.out.println(reservationForZoe.getReservationTotal());
        reservationForZoe.setIsWeekend(true);
        System.out.println(reservationForZoe.getReservationTotal());

        System.out.println(alex.getTotalPay());

    }
}
