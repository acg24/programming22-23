package Unit5.Exercises1;
import java.util.Scanner;
public class Exercise4 {
    public static double[] createArray(){
        Scanner s0 = new Scanner(System.in);
        int min = -10;
        int max = 10;
        System.out.println();
        System.out.println("How many numbers do you want to have the array?");
        int numbers = s0.nextInt();
        double[] a = new double[numbers];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|\t");
        }
        System.out.println();
        System.out.println("______________________________________________________");
        return a;

    }



    public static void minuspos(double[] a1, int[] pos){
        double[] a2 = new double[(a1.length - pos.length)];
        for (int i=0; i<pos.length;i++){
            for (int j=0; j<pos.length;j++){
                if (i!=a1[i]){
                    a2[i] = a1[j];
                }

            }
        }
        System.out.println("ARRAY 2:  ");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + "|\t");
        }
        System.out.println();
        System.out.println("______________________________________________________");

    }





    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double[] array1,array2;
        System.out.print("ARRAY 1:  ");
        array1 = createArray();
        System.out.print("ARRAY 2:  ");
        System.out.println("How many positions do you want to delete to delete from the previous array??");
        int numbers = s1.nextInt();
        int[] pos = new int[numbers];
        for (int i = 0; i < pos.length; i++) {
            do {
                System.out.println("what position do you want to delete from the previous array??");
                pos[i] = s1.nextInt();
                pos[i]=pos[i]-1;
            }while (pos[i]>=array1.length || pos[i]<0);

        }
        for (int i = 0; i < pos.length; i++) {
            System.out.print(pos[i] + "|\t");
        }
        System.out.println();
        System.out.println("______________________________________________________");
        minuspos(array1, pos);

    }
}
