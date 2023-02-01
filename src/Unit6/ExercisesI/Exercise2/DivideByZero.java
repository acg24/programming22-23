package Unit6.ExercisesI.Exercise2;

import java.util.Scanner;

public class DivideByZero {
    public static void method(){
        Scanner s0 = new Scanner(System.in);
        System.out.println("Introduce the first number.");
        int num0 = s0.nextInt();
        System.out.println("Introduce the second number.");
        int num1 = s0.nextInt();
        try{
            int num2= num0/num1;
            System.out.println(num0 + " / " + num1 + " = " + num2);
        } catch(ArithmeticException e){
            System.out.println("Error: division by zero");
        } catch (Exception e){
            System.out.println("Generic exception.");
        }
    }
    public static void main(String[] args) {
        method();
    }
}
