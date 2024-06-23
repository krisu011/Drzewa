package org.example;
import java.lang.Math;

import static org.example.Main.rozmiar;

public class NN_jemiola {

    public static double dystans(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public static int[] NN(int x, int y) {
        int[] nearest = new int[2];
        double min = Double.MAX_VALUE;

        for(int i=0; i<rozmiar; i++)
        {
            for(int j=0; j<rozmiar; j++)
            {
                if(Map.zwrocmape().getMapa()[i][j] != null) /// sprawdzamy odleglosci tylko jak jest juz jakis objekt w tym miejscu na mapie
                {
                    if(Map.zwrocmape().getMapa()[i][j].infected == false)
                    {
                        double dist = dystans(x,y,i,j); // wyliczamy dystans pomiedzy punktami na mapie
                        if(dist != 0)
                        {
                            if(dist<min)
                            {
                                nearest[0] = i;
                                nearest[1] = j;
                                min = dist;
                            }
                        }
                    }
                }

            }
        }
        return nearest;
    }
}