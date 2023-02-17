package Unit7.ExercisesII.Exercise1;

import java.io.*;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner s0 = new Scanner(System.in);
        System.out.println("Intro a number:");
        int num0= s0.nextInt();
        FileWriter fw =null;

        try {
            fw = new FileWriter("nums.bin");
            fw.write(num0);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
