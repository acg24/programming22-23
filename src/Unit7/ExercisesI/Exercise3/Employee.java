package Unit7.ExercisesI.Exercise3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private double salary;
    private MobilePhone phone;
    public Employee(String n, double s, MobilePhone mp){
        this.name=n;
        this.salary=s;
        this.phone=mp;
    }
    public void display(){
        System.out.println("[ Name: " + this.name + "Salary: " + this.salary + "Mobile phone: " + this.phone +" ]" );
    }
    /*
  =======================================================================================================================================================================
     - (without parameters) increments the salary by 10, and calls during 15  minutes.*/
    public void work(){
        this.salary=this.salary+10;
        this.phone.call(15);
    }
    /*
  =======================================================================================================================================================================
     - increments the salary by g and calls m minutes.*/
    public void work(int g, int m){
        this.salary=this.salary+g;
        this.phone.call(m);
    }
    /*
  =======================================================================================================================================================================
     - Geters.*/
    public String getName(){
        return this.name;
    }
    public MobilePhone getPhone() {
        return this.phone;
    }

}
