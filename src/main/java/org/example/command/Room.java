package org.example.command;

import org.example.command.data.Guest;


public class Room implements Option {

    @Override
    public void charge(Guest guest) {
        guest.setRentCost(100);
    }
}
