package Lab1;

public class Fir extends Thread {

    int id;

    Window win;

    int processorLoad;

    public Fir(int id,int priority,Window win, int procLoad){

        this.id=id;

        this.win=win;

        this.processorLoad=procLoad;

        this.setPriority(id % 6 + 2);

    }

    public void run(){
        int c=0;
        int x = 1;

        while(c<1000){
            for(int j=0;j<this.processorLoad;j++) { x = (x << 3) ^ (x >> 4); }
            c++;
            this.win.setProgressValue(id, c);
        }
    }
}
