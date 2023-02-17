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
        List<String> nums=new ArrayList<String>();

        while (aux.equals("y")){
            System.out.println("Intro a number:");
            String num0= s0.nextLine();
            nums.add(num0);
            System.out.println("do you want to introduce more numbers??(y/n)");
            aux=s1.nextLine();
        }

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("file1.bin"));
            for (int i=0;i<nums.size();i++) {
                bw.write((nums.get(i)));
                bw.write(" ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("ERROR writing");
        }finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        BufferedReader br = null;
        bw = null;
        try {
            br = new BufferedReader(new FileReader("file1.bin"));
            bw = new BufferedWriter(new FileWriter("file1.text"));
            
            String result= br.readLine();
            String[] array = result.split(" ");

            for (int i=0;i< array.length-1;i++){
                bw.write(array[i]);
                bw.newLine();
            }
            bw.write(array[array.length-1]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("ERROR writing");
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
