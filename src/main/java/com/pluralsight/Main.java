package com.pluralsight;



public class Main {
    public static void main(String[] args) {
        Employee alex = new Employee(1,"Alex","frontDest",21,10);
        Room room101 = new Room("king",2);
        Reservation reservationForZoe = new Reservation(room101,10);
        System.out.println(reservationForZoe.getReservationTotal());
        reservationForZoe.setIsWeekend(true);
        System.out.println(reservationForZoe.getReservationTotal());

        Hotel fiveStarHotel = new Hotel("fiveStar",5,10);
        System.out.println(fiveStarHotel.getAvailableRoom());
        System.out.println(fiveStarHotel.getAvailableSuites());
        fiveStarHotel.bookRoom(2,false);
        fiveStarHotel.bookRoom(2,true);
        System.out.println(fiveStarHotel.getAvailableRoom());
        System.out.println(fiveStarHotel.getAvailableSuites());







    }
}
