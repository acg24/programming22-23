package Unit5.ExercisesV;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Exercise1 {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    public Exercise1(ArrayList<Integer> nmbrs){
        this.numbers=nmbrs;
    }
    public void load10Divisors(int n){
        for (int i=0;i<10;i++){
            for (int j=1;j<n;j++){
                while (n%j==0){
                    numbers.add(n);
                }
            }
        }
    }
    public void show(){
        System.out.println("The Arraylist is:");
        for (int i=0;i< numbers.size();i++) {
            Integer thisNumber = (Integer) numbers.get(i);
            System.out.print(thisNumber + ", ");
        }
        System.out.println();
    }
    public void clear(){ numbers.clear(); }
    public void loadRandom100(){
        Random rand = new Random();
        for (int i=0;i<20;i++){
            int num = rand.nextInt((100 - (-100)) + 1) + (-100);
            numbers.add(num);
        }
    }
    public void loadRandom20(){
        Random rand = new Random();
        int num=0;
        for (int i=0;i<20;i++){
            do {
                num = rand.nextInt((20 - (-20)) + 1) + (-20);
            }
            while (numbers.contains(num) || numbers.contains(num));
            numbers.add(num);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arra = new ArrayList<Integer>();
        Exercise1 arraL= new Exercise1(arra);
        arraL.load10Divisors(50);
        arraL.show();
        arraL.clear();
        arraL.show();
        arraL.loadRandom100();
        arraL.show();
        arraL.clear();
        arraL.loadRandom20();
        arraL.show();
    }
}
