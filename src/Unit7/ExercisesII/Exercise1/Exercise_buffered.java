package Unit7.ExercisesII.Exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_buffered {
    public static void main(String[] args) {
        Scanner s0 = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        String aux="y";
        List<Integer> nums=new ArrayList<Integer>();

        while (aux.equals("y")){
            System.out.println("Intro a number:");
            int num0= s0.nextInt();
            nums.add(num0);
            System.out.println("do you want to introduce more numbers??(y/n)");
            aux=s1.nextLine();
        }

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("file1.bin"));
            bw.write(nums.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
