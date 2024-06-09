package org.example;
import java.util.Random;


public class Brzoza_Spread implements Spread{
    @Override
    public int[] Spread(int x, int y, int[][] map)
    {
        int[] tab = new int[2];
        Random rand = new Random();
        int los = rand.nextInt(2);
        if(los == 0)
        {
            if(x+2 != map[0].length)
            {
                if(y+2 != map.length)
                {
                    if(map[x+2][y+2] == 0)
                    {
                        tab[0] = x+2;
                        tab[1] = y+2;
                    }
                }
                else
                {
                    if(map[x+2][y-2] == 0)
                    {
                        tab[0] = x+2;
                        tab[1] = y-2;
                    }
                }
            }
            else
            {
                if(y+2 != map.length)
                {
                    if(map[x-2][y+2] == 0)
                    {
                        tab[0] = x-2;
                        tab[1] = y+2;
                    }
                }
                else
                {
                    if(map[x-2][y-2] == 0)
                    {
                        tab[0] = x-2;
                        tab[1] = y-2;
                    }
                }
            }
        }
        else
        {
            if(x-2 != map[0].length)
            {
                if(y-2 != map.length)
                {
                    if(map[x-2][y-2] == 0)
                    {
                        tab[0] = x-2;
                        tab[1] = y-2;
                    }
                }
                else
                {
                    if(map[x-2][y+2] == 0)
                    {
                        tab[0] = x-2;
                        tab[1] = y+2;
                    }
                }
            }
            else
            {
                if(y-2 != map.length)
                {
                    if(map[x+2][y-2] == 0)
                    {
                        tab[0] = x+2;
                        tab[1] = y-2;
                    }
                }
                else
                {
                    if(map[x+2][y+2] == 0)
                    {
                        tab[0] = x+2;
                        tab[1] = y+2;
                    }
                }
            }
        }
        return tab;
    }
}
