package org.example;
import java.util.Random;


public class Brzoza_Spread implements Spread{
    /// x = 2   y = 3
    @Override
    public int[] Spread(int x, int y, int[][] map, int n)
    {
        int[] tab = new int[2];
        Random rand = new Random();
        int los = rand.nextInt(2);
        if(los == 0)
        {
            if(x+2 < n)
            {
                if(y+2 < n)
                {
                    if(map[y+2][x+2] == 0)
                    {
                        tab[0] = x+2;
                        tab[1] = y+2;
                    }
                }
                else
                {
                    if(map[y+2][x-2] == 0)
                    {
                        tab[0] = x+2;
                        tab[1] = y-2;
                    }
                }
            }
            else
            {
                if(y+2 < n)
                {
                    if(map[y-2][x+2] == 0)
                    {
                        tab[0] = x-2;
                        tab[1] = y+2;
                    }
                }
                else
                {
                    if(map[y-2][x-2] == 0)
                    {
                        tab[0] = x-2;
                        tab[1] = y-2;
                    }
                }
            }
        }
        else
        {
            if(x-2 < n)
            {
                if(y-2 > 0)
                {
                    if(map[y-2][x-2] == 0)
                    {
                        tab[0] = x-2;
                        tab[1] = y-2;
                    }
                }
                else
                {
                    if(map[x=y-2][y=x+2] == 0)
                    {
                        tab[0] = x-2;
                        tab[1] = y+2;
                    }
                }
            }
            else
            {
                if(y-2 > 0)
                {
                    if(map[y+2][x-2] == 0)
                    {
                        tab[0] = x+2;
                        tab[1] = y-2;
                    }
                }
                else
                {
                    if(map[y+2][x+2] == 0)
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
