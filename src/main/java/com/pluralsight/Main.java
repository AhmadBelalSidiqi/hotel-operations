package com.pluralsight;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Employee alex = new Employee(1,"Alex","frontDest",21,10);
        Room room101 = new Room("king",2);
        Reservation reservationForZoe = new Reservation(room101,10);
        System.out.println(reservationForZoe.getReservationTotal());
        reservationForZoe.setIsWeekend(true);
        System.out.println(reservationForZoe.getReservationTotal());

        System.out.println("Total pay : " + alex.getTotalPay());

        alex.setPunchIn(LocalTime.of(1,1,1));

        System.out.println("Punch In : " + alex.getPunchIn());
        System.out.println("Total hours Worked : " + alex.getHoursWorked());

        alex.punchOut();

        System.out.println("Punch Out : "+alex.getPunchOut());
        System.out.println("Total hours Worked : " + alex.getHoursWorked());
        System.out.println("Total pay : " + alex.getTotalPay());




    }
}
