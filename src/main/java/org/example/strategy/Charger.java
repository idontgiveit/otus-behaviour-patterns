package org.example.strategy;

import org.example.command.*;
import org.example.command.data.Guest;


public class Charger {
    public enum Charges {
        BREAKFAST(new Breakfast()),
        EXTRABED(new ExtraBed()),
        MINIBAR(new MiniBar()),
        ROOM(new Room());

        Charges(final Option option) {
            this.option = option;
        }

        final Option option;
    }

    public static void charge(Guest user, Charges type) {
        type.option.charge(user);
    }

}
