package org.example;
import java.lang.Math;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int [][] tab = new int[400][5];
    static int licznik=0;

    public static void dodaj()
    {
        System.out.println("Podaj polozenie drzewa (X,Y)");
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        System.out.println("Ktore drzewo(1-Brzoza 2-Buk 3-Dab 4-Lipa)?");
        int which = scan.nextInt();
        System.out.println("Czy drzewo jest zainfekowane? (1=tak, 0=nie)");
        int infected = scan.nextInt();
        tab[licznik][0] = which;
        tab[licznik][1] = X;
        tab[licznik][2] = Y;
        tab[licznik][3] = infected;
        tab[licznik][4] = 0;
        licznik = licznik + 1;
    }


    public static void main(String[] args) {
        double zasieg=1.0;
        int n = 20; /// Wymiar mapy to n x n
        int[][] mapa = new int[n][n];
        /// ktore X Y infected? lifetime
        System.out.println("Mapa ma wymiary: " + n + "x" + n);
        System.out.println("Ile drzew chcesz dodac?");
            Scanner scan = new Scanner(System.in);
            int ile = scan.nextInt();
        /// bardzo poczatkowa reprezentacja mapy

        for(int i=0; i<20; i++){
            for(int j=0; j<20; j++){
                mapa[i][j] = 0;
            }
        }

        for(int i=0; i<ile; i++)
        {
            dodaj();
        }

        for(int i=0; i<10; i++){
            if(tab[i][3]==1)
            {
                mapa[tab[i][1]][tab[i][2]] = tab[i][0]*(-1);
            }
            else
            {
                mapa[tab[i][1]][tab[i][2]] = tab[i][0];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mapa[i][j]+ " ");
            }
            System.out.println();
        }
    }
}