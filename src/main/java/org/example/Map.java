package org.example;
import java.util.ArrayList;
import static org.example.Main.rozmiar;

public class Map {
    static Map instance = null;
    private Drzewo[][] mapa;
    public static ArrayList<Jemiola> jemioly = new ArrayList<>();

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

    public void dodajDrzewo(int x, int y, Drzewo drzewo) {
        mapa[x][y] = drzewo;
    }

    public void spreadTrees(int rozmiar) {
        for (int x = 0; x < rozmiar; x++) {
            for (int y = 0; y < rozmiar; y++) {
                if (mapa[x][y] != null) {
                    mapa[x][y].spread(rozmiar);
                }
            }
        }
    }


    public void printMap(int n) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (mapa[x][y] == null) {
                    System.out.print(".");
                }
                else {
                    if(mapa[x][y].infected){
                        System.out.print("\u001B[31m");
                        System.out.print(mapa[x][y].getName());
                        System.out.print("\u001B[37m");
                    }
                    else
                    {
                        System.out.print("\033[0;32m");
                        System.out.print(mapa[x][y].getName());
                        System.out.print("\u001B[37m");
                    }

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
        for(int i=0; i<jemioly.size(); i++){
            jemioly.get(i).lifetime++;
        }
    }

    public void infection(){
        for(int i=0; i<jemioly.size(); i++){
            jemioly.get(i).infect();
        }
    }

}