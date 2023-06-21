package org.example.strategy;

import org.example.command.data.Guest;

import static org.example.strategy.Charger.Charges;


public class GuestExample {
    public static void main(String[] args) {
        Guest guest = new Guest("Ivan Ivanov");
        Charger.charge(guest, Charges.ROOM);
        Charger.charge(guest, Charges.BREAKFAST);
        Charger.charge(guest, Charges.BREAKFAST);
        Charger.charge(guest, Charges.EXTRABED);

        System.out.println(guest);
    }
}
