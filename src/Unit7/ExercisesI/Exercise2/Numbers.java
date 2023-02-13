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
             dos.writeInt(num);
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
    public static void addNumbers(String fileName, List<Integer> nums){
        for (int i=0; i<nums.size();i++){
            add1Num(fileName, (int)nums.get(i));
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
                find=true;
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
        try {
           while(dis.available()>0){
                System.out.print((int)dis.readInt() + ", ");
            }
        } catch (IOException e) {
            System.out.println("Error reading.");
        }
    }

    public static void main(String[] args) {
        System.out.println("1_=============================================");
        List<Integer> nums0 = new ArrayList<Integer>();
        nums0.add(1);
        nums0.add(2);
        nums0.add(3);
        nums0.add(4);
        addNumbers("file1.bin", nums0);
        System.out.println("2_=============================================");
        int num1=generate1Num(1,5);
        add1Num("file1.bin", num1);
        System.out.println("3_=============================================");
        addNumbers("file1.bin", generateNums(1,4,5));
        System.out.println("4_=============================================");
        List<Integer> dis = new ArrayList<Integer>();
        DataInputStream dis0 = null;
        try {
            dis0 = new DataInputStream(new FileInputStream("file1.bin"));
            displayFile(dis0);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if (dis0!= null){
                try {
                    dis0.close();
                    System.out.println();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("5_=============================================");
        /*DataInputStream dis1 = null;
        try {
            dis1 = new DataInputStream(new FileInputStream("file1.bin"));
            displayFile(dis1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if (dis1!= null){
                try {
                    dis0.close();
                    System.out.println();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }*/
        System.out.println("6_=============================================");
        System.out.println("7_=============================================");
        System.out.println("8_=============================================");
        System.out.println("9_=============================================");
    }
}
