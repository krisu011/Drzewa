package org.example;

import java.util.Random;

public class Buk_Spread implements Spread{
    @Override
    public int[] Spread(int x, int y, int[][] map, int n)
    {
        int[] tab = new int[2];
        Random rand = new Random();
        int los = rand.nextInt(2);
        if(los == 0)
        {
            if(x+2 != map[0].length && y+2 != map.length)
            {
                if(map[x+2][y+2] == 0)
                {
                    tab[0] = x;
                    tab[1] = y;
                }
            }
        }
        return tab;
    }
}
