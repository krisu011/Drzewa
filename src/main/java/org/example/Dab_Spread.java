package org.example;

public class Dab_Spread implements Spread {

    @Override
    public void Spread(int y, int x, Map mapa) {
        Drzewo[][] map = mapa.zwrocmape();
        int n = map.length;

        int[] dx = { 0, 1, -1, 0};
        int[] dy = { 1, 0, 0, -1};
        // 4 4
        for (int i = 0; i < dx.length; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            System.out.println(newX + " " + newY);
            if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                System.out.println("pierwszy if"+ map[newY][newX]);
                if (map[newY][newX] == null) {
                    System.out.println("drugi if");
                    Dab dab = new Dab(newY, newX, 0, 0, false);
                    mapa.dodajDrzewo(newY, newX, dab);
                }
            }
        }
    }
}
