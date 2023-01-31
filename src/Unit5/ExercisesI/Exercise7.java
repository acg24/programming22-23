package Unit5.ExercisesI;
import java.util.Scanner;
public class Exercise7 {
    public static int[] createArray() {
        Scanner s0 = new Scanner(System.in);
        int min = -10;
        int max = 10;
        System.out.println();
        System.out.println("How many numbers do you want to have the array?");
        int numbers = s0.nextInt();
        int[] a = new int[numbers];
        for (int i = 0; i < a.length; i++) {
            System.out.println("input a number??");
            a[i]  = s0.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|\t");
        }
        System.out.println();
        System.out.println("______________________________________________________");
        return a;
    }
    static void bubbleSort(int [] a) {
        int aux = 0;
        for(int i=0; i < a.length; i++){
            for(int j=1; j < (a.length-i); j++){
                if( a [j-1] > a[j]){
                    aux = a[j-1];
                    a[j-1] = a[j];
                    a[j] = aux;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[] array1;
        System.out.print("ARRAY 1:  ");
        array1 = createArray();
        bubbleSort(array1);


    }
}
