package com.ricardosouto.hotel_booking;

import java.time.LocalDate;

public class Reservation {

    private Guest guest;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;


    public Reservation(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }
}
