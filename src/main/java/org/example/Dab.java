package org.example;

public class Dab extends Drzewo {
    String closest;

    //nazwa = "D";

    Dab(int x, int y, int lifetime, boolean infected, String name) {
        super(x, y, lifetime, infected, name);
    }

    public void spread(int n) {

        int x = getx();
        int y = gety();

        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        // 4 4
        int co_ile =4;

        if(infected)
        {
            co_ile=co_ile*2;
        }

        if (getlifetime() % co_ile == 0) {
            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                    if (Map.zwrocmape().getMapa()[newX][newY] == null) {
                        Dab dab = new Dab(newX, newY, 1, false, "D");
                        Map.zwrocmape().dodajDrzewo(newX, newY, dab);
                    }
                }
            }
        }
    }
}
