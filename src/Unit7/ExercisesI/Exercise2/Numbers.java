package Unit7.ExercisesI.Exercise2;

public class Numbers {
    public int generate1Num(int lowLimit, int uppLimit){
        int result=0;
        result= (int)(Math.random()*uppLimit+lowLimit);
        System.out.println(result);
        return result;
    }
}
