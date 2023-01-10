package Unit5.Exercises1;
import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args){
        int[] numbers = new int[10];
        Scanner s0 = new Scanner(System.in);

        for (int i=0;i<numbers.length;i++){
            System.out.print("Introduce the number: ");
            int num = s0.nextInt();
            numbers[i]=num;
        }
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
