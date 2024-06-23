package org.example;

import static org.example.Main.rozmiar;

public class Map {
    static Map instance = null;
    private Drzewo[][] mapa;
    private Map(){
        this.mapa = new Drzewo[rozmiar][rozmiar];
    }

    public static Map zwrocmape(int n) {
        if(instance == null){
            instance = new Map();
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

    public void spreadTrees(int rozmiar) {
        for (int y = 0; y < rozmiar; y++) {
            for (int x = 0; x < rozmiar; x++) {
                if (mapa[y][x] != null) {
                    mapa[y][x].spread(rozmiar);
                }
            }
        }
    }


    public void printMap(int n) {
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (mapa[y][x] == null) {
                    System.out.print(".");
                }
                else {
                    if(mapa[y][x].infected){
                        System.out.print("\u001B[31m");
                        System.out.print(mapa[y][x].getName());
                        System.out.print("\u001B[37m");
                    }
                    System.out.print("\033[0;32m");
                    System.out.print(mapa[y][x].getName());
                    System.out.print("\u001B[37m");
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