package org.example;

public class Dab extends Drzewo {
    String closest;

    //nazwa = "D";

    Dab(int x, int y, int lifetime, boolean infected) {
        super(x, y, lifetime, infected);
    }

    public void spread(int n) {

        int x = getx();
        int y = gety();

        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        // 4 4
        if (getlifetime() % 4 == 0) {
            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                //System.out.println(newX + " " + newY);
                if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                    //System.out.println("pierwszy if"+ map[newY][newX]);
                    if (Map.zwrocmape().getMapa()[newY][newX] == null) {
                        //System.out.println("drugi if");
                        Dab dab = new Dab(newY, newX, 1, false);
                        Map.zwrocmape().dodajDrzewo(newY, newX, dab);
                    }
                }
            }
        }
    }
}
