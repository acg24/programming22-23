package Unit7.ExercisesII.Exercise3;

import javax.management.StringValueExp;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s0 = new Scanner(System.in);
        System.out.println("Introduce a text for the file0:");
        String introText=s0.nextLine();
        BufferedWriter fw=null;
        try {
             fw=new BufferedWriter(new FileWriter("file0.txt",true));
            String[] aux= introText.split(" ");
            for (int i=0; i< aux.length;i++){
                StringBuilder reverseString = new StringBuilder(aux[i]);
                reverseString.reverse();
                if (reverseString.length()>=30){
                    reverseString= new StringBuilder(reverseString.substring(0, 30));
                }
                fw.write(reverseString.toString() + " ");
                System.out.print(reverseString.toString() + " ");
            }
            fw.newLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("The text is not written.");
        }
        finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("error closing the file.");
            }
        }
    }
}
