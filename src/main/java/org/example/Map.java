package org.example;

public class Map {
    Drzewo[][] mapa;

    Map(int n) {
        mapa = new Drzewo[n][n];
    }

    public Drzewo[][] zwrocmape() {
        return mapa;
    }

    public void dodajDrzewo(int y, int x, Drzewo drzewo) {
        mapa[y][x] = drzewo;
    }
}
