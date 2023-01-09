package Unit5.Exercises1;

public class Exercise3 {
    public static void main (String[] args){
        Scanner s0 = new Scanner(System.in);
        int aux=0;
        String[] letters ={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"} ;
        System.out.print("Introduce the number: ");
        int num = s0.nextInt();
        aux= num%23;
        System.out.println(aux);
        System.out.println("Your ID is: " + num +" "+ letters[aux]);

    }
}
