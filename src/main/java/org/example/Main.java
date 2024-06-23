package org.example;

public class Main {
    public static final String GREEN = "\033[0;32m";
    public static final String RED = "\033[0;31m";
    ///System.out.print("\u001B[37m");

    public static int rozmiar = 300;

    public static void main(String[] args) {
        System.out.print("\u001B[37m"); /// zmiana na czcionke jednego koloru

        Map.zwrocmape(rozmiar);
        int iteracje = 250;

        Brzoza brzoza = new Brzoza(20, 20, 10, false, "B");
        Dab dab = new Dab(14, 14, 10, false, "D");
        //Lipa lipa = new Lipa(40,40,1,false,"L");
        Lipa lipa2 = new Lipa(41,40,1,true,"L");
        Jemiola jemiola = new Jemiola(41,40, 1);

        Map.zwrocmape().dodajDrzewo(20, 20, brzoza);
        Map.zwrocmape().dodajDrzewo(14, 14, dab);
        //Map.zwrocmape().dodajDrzewo(40,40, lipa);
        Map.zwrocmape().dodajDrzewo(41,40, lipa2);

        ///System.out.println("Poczatkowa mapa:");
        ///Map.zwrocmape().printMap(rozmiar);

        for (int i = 0; i < iteracje; i++) {
            ///System.out.println("Iteracja " + (i + 1) + ":");
            Map.zwrocmape().spreadTrees(rozmiar);
            ///Map.zwrocmape().printMap(rozmiar);
            Map.zwrocmape().updateObjectsLifetime(rozmiar);
        }

        Map.zwrocmape().printMap(rozmiar);
    }
}
