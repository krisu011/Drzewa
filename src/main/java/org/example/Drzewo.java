package org.example;

abstract public class Drzewo {
    int x, y, lifetime, wherex, wherey, size;
    boolean infected;
    String name;
    public Drzewo(String name,int x, int y, int lifetime, int wherex, int wherey, int size, boolean infected) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.lifetime = lifetime;
        this.wherex = wherex;
        this.wherey = wherey;
        this.size = size;
        this.infected = infected;
    }

}
