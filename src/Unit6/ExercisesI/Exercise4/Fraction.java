package Unit6.ExercisesI.Exercise4;

public class Fraction {
    private int numer=0;
    private int denom=0;
    public Fraction(int n, int d) {
        this.numer=n;
        this.denom=d;
    }
    public String toString(){
        System.out.println("=================================================================");
        return ("Function: numerator(" + numer)+ ") denominator(" + denom + ").";

    }
    /*
    =======================================================================================================================================================================
       -Intro a fraction and sum it with this.
       -Return a simplify Fraction as result.*/
    public Fraction adding(Fraction introF)  {
        System.out.println("ADDING");
        Fraction f2 = new Fraction(1, 1);
        try{
            f2.numer=this.numer*introF.denom+introF.numer*this.denom;
            f2.denom=this.denom*introF.denom;
            if (this.denom == 0 || introF.denom==0) {
                throw new FractionException("Cannot instantiate a fraction with denominator 0.");
            }
            return f2.simplify();
        } catch (FractionException f){
            System.out.println(f);
        }
        // return a null because the operation can't be done. The user I will have to enter a new fraction.
        return null;
    }
    /*
    =======================================================================================================================================================================
       -Intro a fraction and rest it with this.
       -Return a simplify Fraction as result.*/
    public Fraction subtracting(Fraction introF){
        System.out.println("SUBTRACTING");
        Fraction f2 = new Fraction(1, 1);
        try{
            f2.numer=this.numer*introF.denom-introF.numer*this.denom;
            f2.denom=this.denom*introF.denom;
            if (denom == 0 || introF.denom==0) {
                throw new FractionException("Cannot instantiate a fraction with denominator 0.");
            }
            return f2.simplify();
        }catch (FractionException f){
            System.out.println(f);
        }
        // return a null because the operation can't be done. The user I will have to enter a new fraction.
        return null;
    }
    /*
    =======================================================================================================================================================================
       -Intro a fraction and multiply it with this.
       -Return a simplify Fraction as result.*/
    public Fraction multiplying(Fraction introF){
        System.out.println("MULTIPLYING");
        Fraction f2 = new Fraction(1, 1);
        try{
            f2.numer=this.numer*introF.numer;
            f2.denom=this.denom*introF.denom;
            if (denom == 0 || introF.denom==0) {
                throw new FractionException("Cannot instantiate a fraction with denominator 0.");
            }
            return f2.simplify();
        }catch (FractionException f){
            System.out.println(f);
        }
        // return a null because the operation can't be done. The user I will have to enter a new fraction.
        return null;
    }
    /*
    =======================================================================================================================================================================
       -Intro a fraction and divide it with this.
       -Return a simplify Fraction as result.*/
    public Fraction dividing(Fraction introF){
        System.out.println("DIVIDING");
        Fraction f2 = new Fraction(1, 1);
        try{
            f2.numer=this.numer*introF.denom;
            f2.denom=this.denom*introF.numer;
            if (denom == 0 || introF.denom==0) {
                throw new FractionException("Cannot instantiate a fraction with denominator 0.");
            } else if (introF.numer==0) {
                throw new FractionException("This operation  results in an invalid fraction.");
            }
            return f2.simplify();
        }catch (FractionException f){
            System.out.println(f);
        }
        // return a null because the operation can't be done. The user I will have to enter a new fraction.
        return null;
    }
    /*
   =======================================================================================================================================================================
      -Return a simplify Fraction.*/
    public Fraction simplify(){
        int aux;
        Fraction result = new Fraction(numer, denom);
            for (int i=1;i<((this.numer+this.denom)/2);i++){
                if (numer%i==0 && denom%i==0){
                    result = new Fraction(numer/i, denom/i);
                }
            }
            return result;
    }
    public void prueva(){}
}
