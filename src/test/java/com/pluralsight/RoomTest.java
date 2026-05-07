package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void is_room_occupied() {
        //Arrange
        Room room = new Room("101",2);
        room.checkedIn();
        assertTrue(room.isOccupied);
    }

    @org.junit.jupiter.api.Test
    void is_room_dirty() {
        //Arrange
        Room room = new Room("101",2);
        room.checkedIn();
        assertTrue(room.isDirty);
    }
    @org.junit.jupiter.api.Test
    void is_new_room_occupied() {
        Room room = new Room("102",2);
        assertFalse(room.isOccupied);
    }


    @org.junit.jupiter.api.Test
    void is_room_clean() {
        Room room = new Room("103",2);
        room.checkedIn();
        room.cleanRoom();
        assertFalse(room.isDirty);


    }
}