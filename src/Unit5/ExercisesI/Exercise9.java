package Unit5.ExercisesI;
import java.util.Arrays;
public class Exercise9 {
    public static void main(String[] args) {
        int[] arra0 = new int[10];
        int[] arra1 = new int[10];
        Arrays.fill(arra0, 0);
        System.out.println(Arrays.toString(arra0));
        Arrays.copyOf(arra0,  arra1.length);
        System.out.println(Arrays.toString(arra1));
    }
}
