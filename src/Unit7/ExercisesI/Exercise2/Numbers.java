package Unit7.ExercisesI.Exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public static int generate1Num(int lowLimit, int uppLimit){
        int result=0;
        result= (int)(Math.random()*uppLimit+lowLimit);
        return result;
    }
    public static List<Integer> generateNums(int lowLimit, int uppLimit, int amount){
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0; i<amount;i++){
            result.add(generate1Num(lowLimit,uppLimit));
        }
        return result;
    }
    public static void add1Num(String fileName, int num){
        DataOutputStream dos=null;
        try {
             dos =new DataOutputStream
                    (new FileOutputStream(fileName, true));
            dos.write(num);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (dos!=null){
                    dos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void addNumbers(String fileName, int[] nums){
        for (int i=0; i<nums.length;i++){
            add1Num(fileName, nums[i]);
        }
    }
    public static int findInFile(String fileName, int pos){
        int occupying=0;
        DataInputStream dis=null;
        try {
            dis =new DataInputStream
                    (new FileInputStream(fileName));
            int aux=0;
            boolean find=false;
            while (find==false || aux<pos){
                occupying=dis.read();
                aux++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (dis!=null){
                    dis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return occupying;
    }
    public static void displayFile(DataInputStream dis){
        List<Integer> result = new ArrayList<Integer>();
        try {
            System.out.println(dis.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (dis!=null){
                    dis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
  //      add1Num("Unit7_ExercisesI_Exercise2.txt", 5);
        System.out.println(generate1Num(1,3));
        System.out.println("=============================================");
        System.out.println(generateNums(4,5,3));

    }
}
