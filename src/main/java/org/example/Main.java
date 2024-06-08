package org.example;

public class Main {
    public static void main(String[] args) {
        int ile = 2;
        double zasieg=1.0;
        int[][] mapa = new int[20][20];
        /// 1-Brzoza 2-Buk 3-Dab 4-Lipa
        /// bardzo poczatkowa reprezentacja mapy
        for(int i=0; i<20; i++){
            for(int j=0; j<20; j++){
                mapa[i][j] = 0;
            }
        }
        mapa[13][10]=1;
        for(int i=0; i<20; i++){
            for(int j=0; j<20; j++){
                System.out.print(mapa[i][j]+ " ");
            }
            System.out.println();
        }
    }
}