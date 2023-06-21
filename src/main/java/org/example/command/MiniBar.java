package org.example.command;

import org.example.command.data.Charge;
import org.example.command.data.Guest;


public class MiniBar implements Option {
    @Override
    public void charge(Guest guest) {
        guest.addCharge(new Charge("minibar", 20));
    }
}
