package org.example;

public class Main {

    public static int rozmiar = 50;

    public static void main(String[] args) {
        System.out.print("\u001B[37m"); /// zmiana na czcionke jednego koloru

        Map.zwrocmape(rozmiar);
        int iteracje = 150;




        Brzoza brzoza = new Brzoza(20, 20, 10, true, "B");


        Dab dab = new Dab(45, 14, 10, true, "D");
        ///Lipa lipa = new Lipa(40,40,1,false,"L");

        Lipa lipa2 = new Lipa(41,40,1,true,"L");


        Map.zwrocmape().dodajDrzewo(20, 20, brzoza);
        Map.zwrocmape().dodajDrzewo(14, 14, dab);


        Map.zwrocmape().dodajDrzewo(41,40, lipa2);

        ///Dodanie wszystkich zarazonych drzew
        Jemiola jemiola1 = new Jemiola(41,40, 1);
        Map.jemioly.add(jemiola1);
        Jemiola jemiola = new Jemiola(20,20, 1);
        Map.jemioly.add(jemiola);
        Jemiola jemiola2 = new Jemiola(45,14, 1);
        Map.jemioly.add(jemiola2);


        System.out.println("Poczatkowa mapa:");
        Map.zwrocmape().printMap(rozmiar);

        for (int i = 0; i < iteracje; i++) {
            Map.zwrocmape().spreadTrees(rozmiar);
            Map.zwrocmape().infection();
            //Map.zwrocmape().printMap(rozmiar);
            Map.zwrocmape().updateObjectsLifetime(rozmiar);
        }
        System.out.println("Koncowa mapa:");
        Map.zwrocmape().printMap(rozmiar);
    }
}
