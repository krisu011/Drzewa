package org.example;

public class Brzoza extends Drzewo {
    String closest;

    Brzoza(int x, int y, int lifetime, int size, boolean infected) {
        super(x, y, lifetime, size, infected, new Brzoza_Spread());
    }
}
