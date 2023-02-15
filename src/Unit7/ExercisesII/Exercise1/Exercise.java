package Unit7.ExercisesII.Exercise1;

import java.io.*;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner s0 = new Scanner(System.in);
        System.out.println("Intro a number:");
        int num0= s0.nextInt();
        DataOutputStream dos=null;

        try {
            dos =new DataOutputStream(new FileOutputStream("nums.bin", true));
            FileReader f1=new FileReader(new File("nums.bin"));
            dos.writeInt(num0);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dos!=null){
                try {
                    dos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
