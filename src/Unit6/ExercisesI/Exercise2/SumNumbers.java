package Unit6.ExercisesI.Exercise2;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner s0 = new Scanner(System.in);
        int num=0;
        int sum=0;
        int noup=0;
        System.out.println("Introduce a How many numbers do you want to sum:");
        int nums = s0.nextInt();
        for (int i=0;i<nums;i++){
            System.out.println("Introduce a number you want to sum:");
            try {
                num = Integer.parseInt(s0.next());
                sum+=num;
            }catch (NumberFormatException e){
                System.out.println( num + " cannot be added");
                noup++;
            }
        }
        System.out.println("sum: "+sum);
        System.out.println("noup: "+noup);
        s0.close();
    }
}
