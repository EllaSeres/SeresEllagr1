package Lab1;

import java.util.Arrays;

public class matrix {
    int a[][]={{2,3,1},{7,1,6},{9,2,4}};
    int b[][]={{8,5,3},{3,9,2},{2,7,3}};
    int c[][]=new int[3][3],d[][]=new int[3][3];

    void multiply()
    {
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    void sum(){
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                d[i][j]=a[i][j]+b[i][j];
            }
            }
    }

    @Override
    public String toString() {
        return "prod:" +"[["+c[0][0]+","+c[0][1]+","+c[0][2]+"]"+"["+c[1][0]+","+c[1][1]+","+c[1][2]+"]"+"["+c[2][0]+","+c[2][1]+","+c[2][2]+"]"+"]"+"\nsum:"+ "[["+d[0][0]+","+d[0][1]+","+d[0][2]+"]"+"["+d[1][0]+","+d[1][1]+","+d[1][2]+"]"+"["+d[2][0]+","+d[2][1]+","+d[2][2]+"]]";
    }
}

