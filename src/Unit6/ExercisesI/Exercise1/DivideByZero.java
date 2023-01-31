package Unit6.ExercisesI.Exercise1;

import java.lang.module.FindException;
import java.util.Scanner;

public class DivideByZero {
    public static int  method(){
        Scanner s0 = new Scanner(System.in);
        System.out.println("Introduce the first number.");
        int num0 = s0.nextInt();
        System.out.println("Introduce the second number.");
        int num1 = s0.nextInt();
        try{
            int num2= num0/num1;
        } catch(ArithmeticException e){
            System.out.println("Error: division by zero");
        }
    }
    public static void main(String[] args) {
        System.out.println(method());
    }
}
