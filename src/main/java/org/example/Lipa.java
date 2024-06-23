package org.example;

public class Lipa extends Drzewo{

    public Lipa(int x, int y, int lifetime, boolean infected, String name) {
        super(x, y, lifetime, infected, name);

    }

    public void spread(int n) {
        int x = getx();
        int y = gety();

        int[] dx = {3};
        int[] dy = {2};

        int[] dxx = {-3, -3};
        int[] dyy = {-7, 2};

        int co_ile =7;

        if(infected)
        {
            co_ile=co_ile*2;
        }

        if (getlifetime() % co_ile == 0) {
            if (Nearest_Neighbor.NN(x, y) instanceof Lipa) {
                for (int i = 0; i < dxx.length; i++) {
                    int newX = x + dxx[i];
                    int newY = y + dyy[i];
                    //System.out.println(newX + " " + newY);
                    if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                        //System.out.println("pierwszy if"+ map[newY][newX]);
                        if (Map.zwrocmape().getMapa()[newX][newY] == null) {
                            //System.out.println("drugi if");
                            Lipa lipa = new Lipa(newX, newY, 1, false, "L");
                            Map.zwrocmape().dodajDrzewo(newX, newY, lipa);
                        }
                    }
                }
            }
            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                //System.out.println(newX + " " + newY);
                if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                    //System.out.println("pierwszy if"+ map[newY][newX]);
                    if (Map.zwrocmape().getMapa()[newX][newY] == null) {
                        //System.out.println("drugi if");
                        Lipa lipa = new Lipa(newX, newY, 1, false, "L");
                        Map.zwrocmape().dodajDrzewo(newX, newY, lipa);
                    }
                }
            }
        }
    }
}
