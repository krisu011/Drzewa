package org.example;

public class Map {
    static Map instance = null;
    private Drzewo[][] mapa;
    private Map(int n){
        this.mapa = new Drzewo[n][n];
    }

    public static Map zwrocmape(int n) {
        if(instance == null){
            instance = new Map(n);
        }
        return instance;
    }
    public static Map zwrocmape() {
        if(instance == null){
            throw new IllegalStateException();
        }
        return instance;
    }

    public Drzewo[][] getMapa() {
        return mapa;
    }

    public void dodajDrzewo(int y, int x, Drzewo drzewo) {
        mapa[y][x] = drzewo;
    }

    public void spreadTrees(int n) {
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (mapa[y][x] != null) {
                    mapa[y][x].spread(n);
                }
            }
        }
    }
    public void printMap(int n) {
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (mapa[y][x] == null) {
                    System.out.print(0);
                } else if (mapa[y][x] instanceof Brzoza) {
                    System.out.print(1);
                } else if (mapa[y][x] instanceof Dab) {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
    public void updateObjectsLifetime(int n) {
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if(mapa[y][x] != null){
                    mapa[y][x].updatelifetime();
                }
            }
        }
    }
}