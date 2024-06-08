package org.example;
import java.lang.Math;

public class Nearest_Neighbor {
    public static double dystans(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public static int[] NN(int[][] tab, int n, int x, int y) {
        int[] nearest = new int[2];
        double min = Double.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i != x && j != y) // pomijamy ten sam punkt
                {
                    if(tab[i][j] != 0) /// sprawdzamy odleglosci tylko jak jest juz jakis objekt w tym miejscy na mapie
                    {
                        double dist = dystans(x,y,i,j); // wyliczamy dystans pomiedzy punktem na mapie
                        if(dist<min)
                        {
                            min=dist;
                            nearest[0] = i;
                            nearest[1] = j;
                        }
                    }

                }
            }
        }
        return nearest;
    }
}
