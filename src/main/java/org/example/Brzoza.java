package org.example;
import java.util.Random;

public class Brzoza extends Drzewo {
    String closest;

    Brzoza(int x, int y, int lifetime, boolean infected) {
        super(x, y, lifetime, infected);
    }
    public void spread(int n) {
        Random rand = new Random();
        int x = getx();
        int y =gety();
        int los = rand.nextInt(2);
        if (los == 0) {
            if (x + 2 < n) {
                if (y + 2 < n) {
                    if (Map.zwrocmape().getMapa()[y + 2][x + 2] == null) {
                        Brzoza brzoza = new Brzoza(x + 2, y + 2, 1, false);
                        Map.zwrocmape().dodajDrzewo(x + 2, y + 2, brzoza);
                    }
                } else {
                    if (Map.zwrocmape().getMapa()[y - 2][x + 2] == null) {
                        Brzoza brzoza = new Brzoza(x + 2, y - 2, 1, false);
                        Map.zwrocmape().dodajDrzewo(x + 2, y - 2, brzoza);
                    }
                }
            } else {
                if (y + 2 < n) {
                    if (Map.zwrocmape().getMapa()[y + 2][x - 2] == null) {
                        Brzoza brzoza = new Brzoza(x - 2, y + 2, 1, false);
                        Map.zwrocmape().dodajDrzewo(x - 2, y + 2, brzoza);
                    }
                } else {
                    if (Map.zwrocmape().getMapa()[y - 2][x - 2] == null) {
                        Brzoza brzoza = new Brzoza(x - 2, y - 2, 1, false);
                        Map.zwrocmape().dodajDrzewo(x - 2, y - 2, brzoza);
                    }
                }
            }
        } else {
            if (x - 2 >= 0) {
                if (y - 2 >= 0) {
                    if (Map.zwrocmape().getMapa()[y - 2][x - 2] == null) {
                        Brzoza brzoza = new Brzoza(x - 2, y - 2, 0, false);
                        Map.zwrocmape().dodajDrzewo(x - 2, y - 2, brzoza);
                    }
                } else {
                    if (Map.zwrocmape().getMapa()[y + 2][x - 2] == null) {
                        Brzoza brzoza = new Brzoza(x - 2, y + 2, 0, false);
                        Map.zwrocmape().dodajDrzewo(x + 2, y - 2, brzoza);
                    }
                }
            } else {
                if (y - 2 >= 0) {
                    if (Map.zwrocmape().getMapa()[y - 2][x + 2] == null) {
                        Brzoza brzoza = new Brzoza(x + 2, y - 2, 0, false);
                        Map.zwrocmape().dodajDrzewo(x - 2, y + 2, brzoza);
                    }
                } else {
                    if (Map.zwrocmape().getMapa()[y + 2][x + 2] == null) {
                        Brzoza brzoza = new Brzoza(x + 2, y + 2, 0, false);
                        Map.zwrocmape().dodajDrzewo(x + 2, y + 2, brzoza);
                    }
                }
            }
        }
    }
}
