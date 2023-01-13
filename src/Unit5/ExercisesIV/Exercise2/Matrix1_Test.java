package Unit5.ExercisesIV.Exercise2;

import java.util.Scanner;

public class Matrix1_Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Matrix1 m1=new Matrix1();
        m1.loadByRows(sc);
        m1.negatives();
    }
}
