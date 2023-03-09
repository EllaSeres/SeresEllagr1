package Lab1;

public class complexnr {
    int a_re=2 ,b_re=4,a_im=5,b_im=-1;
    int sumim,sumre,prodim,prodre;
    void sum(){
        sumre=a_re+b_re;
        sumim=a_im+b_im;

    }
    void prod(){
        prodre=a_re*b_re-a_im*b_im;
        prodim=a_re*b_im+a_im*b_re;

    }

    @Override
    public String toString() {
        return "The sum: " +
                 sumre +"+"+"("+sumim+")"+"i"+"\n"+
                "The product:"+ prodre +"+"+"("+prodim+")"+"i";
    }
}
