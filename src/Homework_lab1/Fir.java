package Homework_lab1;

import java.util.Observable;

public class Fir extends Observable implements Runnable {
    int id;
    int processorLoad;
    Thread thread;
    Fir(int id,int priority, int procLoad){
        this.id=id;
        this.processorLoad=procLoad;
        thread=new Thread(this);
        thread.setPriority(priority % 6 + 2);
    }
    public void run(){
        int c=0;
        int x = 1;
        while(c<1000){
            for(int j=0;j<this.processorLoad;j++){ x = (x << 3) ^ (x >> 4); } c++;

            setChanged();
            notifyObservers(c);
        }
        System.out.println(x);
    }
}
