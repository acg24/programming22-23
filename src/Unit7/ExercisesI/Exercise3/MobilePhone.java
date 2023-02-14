package Unit7.ExercisesI.Exercise3;

import java.io.Serializable;

public class MobilePhone implements Serializable {
    private String number;
    private double credit; /*saldo*/
    public MobilePhone(String n, double c){
        this.number=n;
        this.credit=c;
    }
    public void display(){
        System.out.println("[ Number: " + this.number + "Credit: " + this.credit + " ]" );
    }
    /*
  =======================================================================================================================================================================
     - Increments the money of the MovilePhone in s.*/
    public void topup(int s){
        this.credit=this.credit + s;
    }
    /*
  =======================================================================================================================================================================
     - Decreases the phone’s credit in 2 for each minute.*/
    public void call(int minutes){
        this.credit= this.credit-(minutes*2);
    }
    /*
  =======================================================================================================================================================================
     - Geters.*/
    public void setCredit(double newCredit){
        this.credit=newCredit;
    }
}
