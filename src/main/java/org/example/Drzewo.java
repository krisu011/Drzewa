package org.example;

abstract public class Drzewo {
    Spread spread;
    int x, y, lifetime, size;
    boolean infected;

    public Drzewo(int y, int x, int lifetime, int size, boolean infected, Spread spread) {
        this.spread = spread;
        this.x = x;
        this.y = y;
        this.lifetime = lifetime;
        this.size = size;
        this.infected = infected;
    }

    public void spread(Map mapa) {
        spread.Spread(y, x, mapa);
    }

}
