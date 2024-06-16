package org.example;
import java.lang.Math;

public class Nearest_Neighbor {
    public static double dystans(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    /// x = 2     y = 3     n = 20
    public static int[] NN(int[][] map, int n, int x, int y) {
        int[] nearest = new int[2];
        double min = Double.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(map[i][j] != 0) /// sprawdzamy odleglosci tylko jak jest juz jakis objekt w tym miejscu na mapie
                {
                    double dist = dystans(x,y,j,i); // wyliczamy dystans pomiedzy punktami na mapie
                    if(dist != 0)
                    {
                        if(dist<min)
                        {
                            min=dist;
                            nearest[0] = j;
                            nearest[1] = i;
                        }
                    }
                }
            }
        }
        return nearest;
    }
}
