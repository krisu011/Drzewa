package org.example;
import java.util.Random;

public class Brzoza extends Drzewo {
    String closest;

    Brzoza(int x, int y, int lifetime, boolean infected, String name) {
        super(x, y, lifetime, infected, name);
    }

    public void spread(int n) {
        Random rand = new Random();
        int x = getx();
        int y = gety();

        int[] dx = {2, -2, 2, -2};
        int[] dy = {2, 2, -2, -2};

        int[] dxx = {3,-3,3,-3};
        int[] dyy = {3,3,-3,-3};

        int co_ile =9;

        if(infected)
        {
            co_ile=co_ile*2;
        }

        if (getlifetime() % co_ile == 0) {
            int los = rand.nextInt(2);
            if (los == 0)
            {
                for (int i = 0; i < dx.length; i++) {
                    int newX = x + dx[i];
                    int newY = y + dy[i];
                    if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                        if (Map.zwrocmape().getMapa()[newY][newX] == null) {
                            Brzoza brzoza = new Brzoza(newX, newY, 1, false, "B");
                            Map.zwrocmape().dodajDrzewo(newX, newY, brzoza);
                        }
                    }
                }
            }
            else
            {
                for (int i = 0; i < dxx.length; i++) {
                    int newX = x + dxx[i];
                    int newY = y + dyy[i];
                    if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                        if (Map.zwrocmape().getMapa()[newX][newY] == null) {
                            Brzoza brzoza = new Brzoza(newX, newY, 1, false, "B");
                            Map.zwrocmape().dodajDrzewo(newX, newY, brzoza);
                        }
                    }
                }
            }
        }
    }
}
