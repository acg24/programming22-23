package Unit6.ExercisesI.Exercise3;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner s0 = new Scanner(System.in);
        int num=0;
        int sum=0;
        String aux="";
        int noup=0;
        System.out.println("Introduce a How many numbers do you want to sum:");
        int nums = s0.nextInt();
        for (int i=0;i<nums;i++){
            System.out.println("Introduce a number you want to sum:");
            try {
                aux=s0.next();
                num = Integer.parseInt(aux);
                sum+=num;
            }catch (NumberFormatException e){
                System.out.println( aux + " cannot be added");
                noup++;
            }
        }
        System.out.println("=================================================================");
        System.out.println("sum: "+sum);
        System.out.println("noup: "+noup);
        System.out.println("=================================================================");
        s0.close();
    }
}
