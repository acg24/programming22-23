package Unit5.Exercises1;
import java.util.Arrays;
public class Exercise10 {
    public static void main(String[] args){
        int[] arra0= new int[10];
        int[] arra1= new int[10];
        Arrays.fill(arra0, 0);
        Arrays.fill(arra1, 1);
        System.out.println(Arrays.toString(arra0));
        System.out.println(Arrays.toString(arra1));
        System.out.println("is arr1 equals to arr2 : " + Arrays.equals(arra0, arra1));
        Arrays.copyOf(arra0,  arra1.length);
        System.out.println();
        System.out.println(Arrays.toString(arra0));
        System.out.println(Arrays.toString(arra1));
        System.out.println("is arr1 equals to arr2 : " + Arrays.equals(arra0, arra1));
    }
}
