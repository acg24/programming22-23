package Unit6.ExercisesI.Exercise4;

public class Fraction {
    private int numer=0;
    private int denom=0;
    public Fraction(int n, int d){
        this.numer=n;
        this.denom=d;
    }
    public String toString(){
        System.out.println("=================================================================");
        return ("Function: numerator(" + numer)+ ") denominator(" + denom + ").";
    }
    public void adding(Fraction introF){
    }
    public void subtracting(Fraction introF){
    }
    public void multiplying(Fraction introF){
    }
    public void dividing(Fraction introF){
    }
    public Fraction simplify(){
        int aux;
        Fraction result = new Fraction(numer, denom);;
        for (int i=1;i<((this.numer+this.denom)/2);i++){
            if (numer%i==0 && denom%i==0){
                result = new Fraction(numer/i, denom/i);
            }
        }
        System.out.println(result);
        return result;
    }
}
