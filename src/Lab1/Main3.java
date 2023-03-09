package Lab1;

public class Main3 {

    private static final int noOfThreads=20;

    private static final int processorLoad=10000000;

    public static void main(String args[]){

        Window win=new Window(noOfThreads);

        for(int i =0; i<noOfThreads; i++){

            new Fir(i,i+2,win,processorLoad).start();

        }

    }

}
