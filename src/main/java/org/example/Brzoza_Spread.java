package org.example;

import java.util.Random;

public class Brzoza_Spread implements Spread {
    /// x = 2 y = 3
    @Override
    public void Spread(int x, int y, Map mapa) {
        Drzewo[][] map = mapa.zwrocmape();
        int n = map.length;

        Random rand = new Random();
        int los = rand.nextInt(2);
        if (los == 0) {
            if (x + 2 < n) {
                if (y + 2 < n) {
                    if (map[y + 2][x + 2] == null) {
                        Brzoza brzoza = new Brzoza(x + 2, y + 2, 0, 0, false);
                        mapa.dodajDrzewo(x + 2, y + 2, brzoza);
                    }
                } else {
                    if (map[y - 2][x + 2] == null) {
                        Brzoza brzoza = new Brzoza(x + 2, y - 2, 0, 0, false);
                        mapa.dodajDrzewo(x - 2, y + 2, brzoza);
                    }
                }
            } else {
                if (y + 2 < n) {
                    if (map[y + 2][x - 2] == null) {
                        Brzoza brzoza = new Brzoza(x - 2, y + 2, 0, 0, false);
                        mapa.dodajDrzewo(x + 2, y - 2, brzoza);
                    }
                } else {
                    if (map[y - 2][x - 2] == null) {
                        Brzoza brzoza = new Brzoza(x - 2, y - 2, 0, 0, false);
                        mapa.dodajDrzewo(x - 2, y - 2, brzoza);
                    }
                }
            }
        } else {
            if (x - 2 >= 0) {
                if (y - 2 >= 0) {
                    if (map[y - 2][x - 2] == null) {
                        Brzoza brzoza = new Brzoza(x - 2, y - 2, 0, 0, false);
                        mapa.dodajDrzewo(x - 2, y - 2, brzoza);
                    }
                } else {
                    if (map[y + 2][x - 2] == null) {
                        Brzoza brzoza = new Brzoza(x - 2, y + 2, 0, 0, false);
                        mapa.dodajDrzewo(x + 2, y - 2, brzoza);
                    }
                }
            } else {
                if (y - 2 >= 0) {
                    if (map[y - 2][x + 2] == null) {
                        Brzoza brzoza = new Brzoza(x + 2, y - 2, 0, 0, false);
                        mapa.dodajDrzewo(x - 2, y + 2, brzoza);
                    }
                } else {
                    if (map[y + 2][x + 2] == null) {
                        Brzoza brzoza = new Brzoza(x + 2, y + 2, 0, 0, false);
                        mapa.dodajDrzewo(x + 2, y + 2, brzoza);
                    }
                }
            }
        }
    }
}
