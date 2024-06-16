package org.example;

public class Dab extends Drzewo {
    String closest;

    Dab(int x, int y, int lifetime, int size, boolean infected) {
        super(x, y, lifetime, size, infected, new Dab_Spread());
    }
}
