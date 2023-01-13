package Unit5.ExercisesIV.Exercise2;

import java.util.Scanner;

public class Matrix1 {
    private int[][] m;
    private int nr=2;
    private int nc=6;

    public Matrix1(){
        this.m = new int[nr][nc];
    }
    public Matrix1(int nr, int nc){
        this.m = new int[nr][nc];
        this.nc=nc;
        this.nr=nr;
    }
    public void loadByRows(Scanner sc){
        for (int i=0;i<this.nr;i++){
            System.out.println("New row:");
            for (int j=0;j<this.nc;j++){
                System.out.printf("Input number in  matrix [%d][%d]\n", j, i);
                m[i][j]=sc.nextInt();
            }
        }
    }
    public void loadByColumns(Scanner sc){
        for (int i=0;i<this.nc;i++){
            System.out.println("New columns:");
            for (int j=0;j<this.nr;j++){
                System.out.printf("Input number in  matrix [%d][%d]\n", j, i);
                m[i][j]=sc.nextInt();
            }
        }
    }
    public void swapRows(int num0, int num1){
        int[] arra;
        arra=m[num0-1];
        m[num1-1]=m[num0-1];
        m[num0-1]=arra;
    }
    public void swapColumns(int num0, int num1){
        int[] arra0=new int[nr];
        int aux;
        for (int i=0;i<this.nr;i++){
            aux = this.m[i][num1];
            this.m[i][num1]=this.m[i][num0];
            this.m[i][num0]=this.m[i][aux];
        }
    }

    public void negatives(){

    }


}
