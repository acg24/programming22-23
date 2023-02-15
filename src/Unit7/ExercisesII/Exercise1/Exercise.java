package Unit7.ExercisesII.Exercise1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner s0 = new Scanner(System.in);
        System.out.println("Intro a number:");
        int num0= s0.nextInt();
        DataOutputStream dos=null;
        
        try {
            dos =new DataOutputStream(new FileOutputStream("nums.bin", true));
            try {
                dos.writeInt((int) num0);
            } catch (IOException e) {
                System.out.println("tou didn't intro a number");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
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
