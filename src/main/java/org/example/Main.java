package org.example;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.lang.Math;

import java.lang.reflect.Array;
 import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int [][] zbior_drzew = new int[400][5]; /// [ktore, X, Y, czy_zarazone?,
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
        zbior_drzew[licznik][0] = which;
        zbior_drzew[licznik][1] = X;
        zbior_drzew[licznik][2] = Y;
        zbior_drzew[licznik][3] = infected;
        zbior_drzew[licznik][4] = 0; /// czas zycia
        licznik = licznik + 1;
    }


    public static void main(String[] args) {
        double zasieg=1.0;
        int n = 20; /// Wymiar mapy to n x n, gdzie n >=10
        int[][] mapa = new int[n][n];

        /// ktore X Y infected? lifetime
        System.out.println("Mapa ma wymiary: " + n + "x" + n);
        System.out.println("Ile drzew chcesz dodac?");
            Scanner scan = new Scanner(System.in);
            int ile = scan.nextInt();

        for(int i=0; i<ile; i++)
        {
            dodaj();
        }

        /// bardzo poczatkowa reprezentacja mapy
        for(int i=0; i<20; i++){
            for(int j=0; j<20; j++){
                mapa[i][j] = 0;
            }
        }

        ///Nearest_Neighbor.NN(mapa, n, 2, 3);

        for(int i = 0; i<licznik; i++){
            if(zbior_drzew[i][3]==1)
            {
                mapa[zbior_drzew[i][2]][zbior_drzew[i][1]] = zbior_drzew[i][0]*(-1);
                zbior_drzew[i][0]=zbior_drzew[i][0]*(-1);
            }
            else
            {
                mapa[zbior_drzew[i][2]][zbior_drzew[i][1]] = zbior_drzew[i][0];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mapa[i][j]+ " ");
            }
            System.out.println();
        }
        int[] tab1 = Nearest_Neighbor.NN(mapa, n, zbior_drzew[0][1], zbior_drzew[0][2]);

        System.out.println(tab1[0] + " " + tab1[1]);
        ///System.out.println(mapa[2][3] + " " + mapa[3][2]); /// mapa od 3 2   to polozenie na mapie o koordynatach 2 3
        for(int i=0; i<licznik; i++)
        {
            if(zbior_drzew[i][1]==tab1[0] && zbior_drzew[i][2]==tab1[1])
            {
                System.out.println(zbior_drzew[i][0]);
            }
        }
        System.out.println(mapa[5][2]);
    }
}