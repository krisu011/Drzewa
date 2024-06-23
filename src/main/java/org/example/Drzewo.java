package org.example;

abstract public class Drzewo {

    int x, y, lifetime;
    boolean infected;
    String name;

    public Drzewo(int x, int y, int lifetime, boolean infected, String name) {

        this.x = x;
        this.y = y;
        this.lifetime = lifetime;
        this.infected = infected;
        this.name = name;
    }

    public void setInfected() {
           this.infected = true;
    }

    public String getName() {
        return name;
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