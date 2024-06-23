package org.example;
import java.util.Scanner;

public class Main {

    public static int rozmiar = 100;



    public static void main(String[] args) {
        System.out.print("\u001B[37m"); /// zmiana na czcionke jednego koloru
        int brzozy=0, deby=0, lipy=0, zarazone=0, niezarazone=0;
        Map.zwrocmape(rozmiar);
        int iteracje;
        System.out.print("Ile iteracji symulacji ma sie wykonac?: ");
        Scanner scan = new Scanner(System.in);
        iteracje = scan.nextInt();

        Brzoza brzoza = new Brzoza(20, 20, 1, true, "B");
        Dab dab = new Dab(45, 45, 1, true, "D");
        Lipa lipa = new Lipa(10,40,1,true,"L");

        Map.zwrocmape().dodajDrzewo(20, 20, brzoza);
        Map.zwrocmape().dodajDrzewo(45, 45, dab);
        Map.zwrocmape().dodajDrzewo(10,40, lipa);

        ///Dodanie wszystkich zarazonych drzew

        Jemiola jemiola = new Jemiola(20,20, 1);
        Map.jemioly.add(jemiola);
        Jemiola jemiola1 = new Jemiola(10,40, 1);
        Map.jemioly.add(jemiola1);
        Jemiola jemiola2 = new Jemiola(45,45, 1);
        Map.jemioly.add(jemiola2);


        System.out.println("Poczatkowa mapa:");
        Map.zwrocmape().printMap(rozmiar);

        for (int i = 0; i < iteracje; i++) {
            //System.out.println("Iteracja " + i + ":");
            Map.zwrocmape().spreadTrees(rozmiar);
            Map.zwrocmape().infection();
            //Map.zwrocmape().printMap(rozmiar);
            Map.zwrocmape().updateObjectsLifetime(rozmiar);
        }
        System.out.println("Koncowa mapa:");
        Map.zwrocmape().printMap(rozmiar);
        for(int i=0; i< rozmiar; i++)
        {
            for(int j=0; j<rozmiar; j++)
            {
                if(Map.zwrocmape().getMapa()[i][j] instanceof Brzoza)
                {
                    brzozy++;
                }
                if(Map.zwrocmape().getMapa()[i][j] instanceof Dab)
                {
                    deby++;
                }
                if(Map.zwrocmape().getMapa()[i][j] instanceof Lipa)
                {
                    lipy++;
                }
                if(Map.zwrocmape().getMapa()[i][j] != null)
                {
                    if(Map.zwrocmape().getMapa()[i][j].infected == true)
                    {
                        zarazone++;
                    }
                    else
                    {
                        niezarazone++;
                    }
                }

            }
        }
        System.out.println("Brzozy: " + brzozy);
        System.out.println("Deby: " + deby);
        System.out.println("Lipa: " + lipy);
        System.out.println("Zarazone: " + zarazone);
        System.out.println("Niezarazone: " + niezarazone);
    }
}
