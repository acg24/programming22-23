package Unit5.ExercisesIV.Exercise2;

public class UnevenMatrix {
    Float[][] nums;
    int nr=4;
    public UnevenMatrix(){
        this.nums= new Float[nr][];
    }
    public UnevenMatrix(int nr){
        this.nums= new Float[nr][];
    }

    public void loadRow(Float[] fl, int row){
        for (int i=0;i<this.nr;i++){
            if (i==(row-1)){
                nums[i]=fl;
            }
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
