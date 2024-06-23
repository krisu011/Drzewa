package org.example;

public class Main {
    public static void main(String[] args) {
        int rozmiar = 10;
        Map.zwrocmape(rozmiar);
        int iteracje = 10;

        Brzoza brzoza = new Brzoza(2, 2, 10, false);
        Dab dab = new Dab(4, 4, 10, false);

        Map.zwrocmape().dodajDrzewo(2, 2, brzoza);
        Map.zwrocmape().dodajDrzewo(4, 4, dab);

        System.out.println("Poczatkowa mapa:");
        Map.zwrocmape().printMap(rozmiar);

        for (int i = 0; i < iteracje; i++) {
            System.out.println("Iteracja " + (i + 1) + ":");
            Map.zwrocmape().spreadTrees(rozmiar);
            Map.zwrocmape().printMap(rozmiar);
            Map.zwrocmape().updateObjectsLifetime(rozmiar);
        }
    }
}
