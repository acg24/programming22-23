package Unit5.Exercises1;

public class Exercise6 {
    public static int[] createArray() {
        Scanner s0 = new Scanner(System.in);
        int min = -10;
        int max = 10;
        System.out.println();
        System.out.println("How many numbers do you want to have the array?");
        int numbers = s0.nextInt();
        int[] a = new int[numbers];
        for (int i = 0; i < a.length; i++) {
            System.out.println("abut what number do you want to have the sum??");
            a[i]  = s0.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|\t");
        }
        System.out.println();
        System.out.println("______________________________________________________");
        return a;

    }


    public static void matrixSum(int[] a1, int num) {
        int aux1=0;
        for (int i=0;i<a1.length;i+=2){
            if(a1[i]+ a1[i+1]==num){
                aux1++;
            }
        }
        int[][] m= new int[aux1][2];
        aux1=0;
        for (int i=0;i<a1.length;i++){
            for (int j=i;j<a1.length;j++){
                if(a1[i]+ a1[i+1]==num){
                    aux1++;
                    m[i][j]=a1[aux1];
                }else{
                    aux1++;
                }
            }
        }

        System.out.println("MATRIX 1:  ");
        for(int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length;j++ ){
                System.out.print(m[i][j] + "|\t");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[] array1;
        System.out.println("abut what number do you want to have the sum??");
        int num = s1.nextInt();
        System.out.print("ARRAY 1:  ");
        array1 = createArray();
        matrixSum(array1, num);


    }
}
