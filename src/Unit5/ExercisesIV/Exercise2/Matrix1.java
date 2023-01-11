package Unit5.ExercisesIV.Exercise2;

public class Matrix1 {
    private int[][] m;
    private int nr=10;
    private int nc=15;

    public Matrix1(){
        this.m = new int[nr][nc];
    }
    public Matrix1(int nc, int nr){
        this.m = new int[nr][nc];
        this.nc=nc;
        this.nr=nr;
    }
    public void loadByRows(int num){
        for (int i=0;i<nc;i++){
            for (int j=0;j<nr;j++){
                m[i][j]=num;
            }
        }
    }
    public void show(){
        for (int i=0;i<nr;i++){
            for (int j=0;j<nc;j++){
                System.out.print(m[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
