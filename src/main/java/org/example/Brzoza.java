package org.example;

public class Brzoza extends Drzewo{
    String closest;
    Brzoza(String name, int x, int y, int lifetime, int wherex, int wherey, int size, boolean infected, String closest) {
        super(name, x, y, lifetime, wherex, wherey, size, infected);
        this.closest = closest;
        name = "Brzoza";
    }
}
