package Unit5.ExercisesI;
import java.util.Scanner;
public class Exercise5 {
    public static double[] createArray() {
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


    public static boolean areSame(double[] a1, double[] a2) {
        boolean bool=true;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == a2[i]) {
                bool= false;
            }
        }
        System.out.println(bool);
        return bool;
    }





    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double[] array1,array2;
        System.out.print("ARRAY 1:  ");
        array1 = createArray();
        System.out.print("ARRAY 2:  ");
        array2 = createArray();
        areSame(array1, array2);


    }
}
