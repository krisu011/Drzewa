package org.example;


public class Jemiola {
    static double range = 2.0;
    int x;
    int y;
    int lifetime;
    public Jemiola(int x, int y, int lifetime) {
        this.x = x;
        this.y = y;
        this.lifetime = lifetime;
    }

    public void infect(){
        int x = this.x;
        int y = this.y;
        int[] kordy = NN_jemiola.NN(x,y);
        if(this.lifetime%10==0)
        {
            if(Map.zwrocmape().getMapa()[kordy[0]][kordy[1]] != null)
            {
                if(Map.zwrocmape().getMapa()[kordy[0]][kordy[1]].infected == false){
                    if(NN_jemiola.dystans(x,y,Map.zwrocmape().getMapa()[kordy[0]][kordy[1]].getx(),Map.zwrocmape().getMapa()[kordy[0]][kordy[1]].gety())<=range){
                        Map.zwrocmape().getMapa()[Map.zwrocmape().getMapa()[kordy[0]][kordy[1]].getx()][Map.zwrocmape().getMapa()[kordy[0]][kordy[1]].gety()].setInfected();
                        Jemiola jemiola = new Jemiola(Map.zwrocmape().getMapa()[kordy[0]][kordy[1]].getx(),Map.zwrocmape().getMapa()[kordy[0]][kordy[1]].gety(),1);
                        Map.jemioly.add(jemiola);
                    }
                }
            }
        }


    }
}
