package org.example;

abstract public class Drzewo {

    int x, y, lifetime;
    boolean infected;

    public Drzewo(int y, int x, int lifetime, boolean infected) {

        this.x = x;
        this.y = y;
        this.lifetime = lifetime;
        this.infected = infected;
    }

    public abstract void spread(int n);

    public void updatelifetime() {
        this.lifetime++;
    }

    public int getlifetime() {
        return this.lifetime;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }
}