package Unit5.ExercisesIV.Exercise2;

public class UnevenMatrix {
    private Float[][] nums;
    int nr=4;
    public UnevenMatrix(){ this.nums= new Float[nr][]; }
    public UnevenMatrix(int num){
        this.nums= new Float[num][];
        this.nr=num;
    }

    public void loadRow(Float[] fl, int row){
        for (int i=0;i<this.nr;i++){
            if (i==(row-1)){
                nums[i]=fl;
            }
        }
    }
    public void displayRow(int row) {
        for (int i = 0; i < this.nums[row].length; i++) {
            System.out.println(this.nums[row][i] + ", ");
        }
    }
    public void displayMatrix(){
        int j=0;
        for (int i=0;i<this.nr;i++){
            System.out.println("New row:");
            while (nums[i][j+1]!=null){
                System.out.println(nums[i][j] + "| ");
                j++;
            }

        }
    }

    public static void main(String[] args) {

    }
}
