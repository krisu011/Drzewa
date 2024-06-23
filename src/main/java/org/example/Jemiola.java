package org.example;
import java.util.ArrayList;

public class Jemiola {
    static double range = 2;
    int x;
    int y;
    int lifetime;
    public Jemiola(int x, int y, int lifetime) {
        this.x = x;
        this.y = y;
        this.lifetime = lifetime;

    }

    public void infect(){
        Drzewo obiekt = Nearest_Neighbor.NN(x,y);
        if(obiekt.infected == false){
            if(Nearest_Neighbor.dystans(x,y,obiekt.getx(),obiekt.gety())<=range){
                Map.zwrocmape().getMapa()[obiekt.getx()][obiekt.gety()].setInfected();
            }
        }
    }

}
