package org.example;

public class Main {
    public static void main(String[] args) {
        int rozmiar = 7;
        Map mapa = new Map(rozmiar);
        int iteracje = 10;

        Brzoza brzoza = new Brzoza(2, 2, 10, 5, false);
        Dab dab = new Dab(4, 4, 10, 5, false);

        mapa.dodajDrzewo(2, 2, brzoza);
        mapa.dodajDrzewo(4, 4, dab);

        System.out.println("Poczatkowa mapa:");
        printMap(mapa);

        for (int i = 0; i < iteracje; i++) {
            System.out.println("Iteracja " + (i + 1) + ":");
            spreadTrees(mapa);
            printMap(mapa);
            updateObjectsLifetime(mapa);
        }
    }

    /// Brzoza - 1, Dąb - 2, Buk - 3, Lipa - 4, zarazone są odpowiednimi cyframi pomnozonymi przez (-1)
    public static void printMap(Map mapa) {
        Drzewo[][] map = mapa.zwrocmape();
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == null) {
                    System.out.print(0);
                } else if (map[y][x] instanceof Brzoza) {
                    System.out.print(1);
                } else if (map[y][x] instanceof Dab) {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }

    public static void spreadTrees(Map mapa) {
        Drzewo[][] map = mapa.zwrocmape();
        int[][] mapka = new int[map.length][map[0].length];
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] instanceof Brzoza) {
                    mapka[y][x] = 1;
                }
                if (map[y][x] instanceof Dab) {
                    mapka[y][x] = 2;
                }
            }
        }
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (mapka[y][x] != 0) {
                    if (mapka[y][x] == 1) {
                        map[y][x].spread(mapa);
                    }
                    if(mapka[y][x] == 2){
                        if(map[y][x].getlifetime() % 4 == 0){
                            map[y][x].spread(mapa);
                        }
                    }
                }
            }
        }
    }
    public static void updateObjectsLifetime(Map mapa) {
        Drzewo[][] map = mapa.zwrocmape();
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if(map[y][x] != null){
                    map[y][x].updatelifetime();
                }
            }
        }
    }
}
