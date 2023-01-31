package Unit5.ExercisesI;

public class Exercise2 {
    public static void main (String[] args){
        int[] numbers = new int[100];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
            System.out.println(numbers[i]);
            sum += i+1;
        }
        avg = ((double)sum)/numbers.length;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+avg);
    }
}
