package org.example.command;

import org.example.command.data.Guest;


public class GuestExample {
    public static void main(String[] args) {
        Guest guest = new Guest("Ivan Ivanov");
        Booking booking = new Booking(guest);

        booking.addOption(new Room());
//        booking.addOption(new MiniBar());
//        booking.addOption(new Breakfast());
        booking.addOption(new ExtraBed());


        new ExtraBed().charge(guest);
        new MiniBar().charge(guest);

        guest = booking.checkOut();

        System.out.println(guest);
    }
}
