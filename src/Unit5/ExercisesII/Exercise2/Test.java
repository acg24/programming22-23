package Unit5.ExercisesII.Exercise2;
//A PARROT HAVE: char sex, int age, char region, String colour
public class Test {
    public static void main(String[] args){
        int n=5;
        Parrot[] p0 = new Parrot[n];
        Parrot[] p1 = new Parrot[n];
        Parrot[] p2 = new Parrot[p0.length + p1.length];
        for (int i=0;i<n;i++){
            p0[i]= new Parrot('m',10,'S',"red");
            p1[i]= new Parrot('f',11,'N',"blue");
        }

        for (int i=0;i<n;i++){
            p2[i*2] =p0[i];
            p2[i*2+1] =p1[i];
        }
        for (int i=0;i<p2.length;i++){
            System.out.println(p2[i].show() + ", ");
        }
    }
}
