package Unit7.ExercisesI.Exercise3;

import java.io.*;
import java.util.List;

public class EmployeesManager implements Serializable {
    private String filename;/*name of the file n which we’ll serialize */
    public EmployeesManager(String fn){
        this.filename=fn;
    }
    /*
  =======================================================================================================================================================================
     - Receives an ArrayList of Employees as a parameter and serializes it.*/
    public void saveEmployees(List<Employee> employees){
        FileOutputStream fileOut= null;
        ObjectOutputStream output=null;
        try {
            fileOut = new FileOutputStream("media.obj");
            output= new ObjectOutputStream(fileOut);
            for (int i=0;i<employees.size();i++){

                output.writeObject(employees.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileOut!=null){
                try {
                    fileOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    /*
  =======================================================================================================================================================================
     - displays the Employees of the file, one by one.*/
    public void displayEmployees(){
        FileInputStream fileIn= null;
        ObjectInputStream input=null;
        try {
            fileIn = new FileInputStream("media.obj");
            input= new ObjectInputStream(fileIn);
            Employee employee=(Employee) input.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileIn!=null){
                try {
                    fileIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    /*
  =======================================================================================================================================================================
     - returns the first employee of the file with "empname" sa name .*/
    public void searchEmployee(String empname){
        FileInputStream fileIn= null;
        ObjectInputStream input=null;
        boolean find=false;
        try {
            fileIn = new FileInputStream("media.obj");
            input= new ObjectInputStream(fileIn);
            while (fileIn.available()>0 && find!=true){
                Employee employee=(Employee) input.readObject();
                if (employee.equals(empname)){
                    System.out.println(employee.getName());
                    find=true;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (find==false){
                System.out.println("There isn't a employee with that name.");
            }
            if (fileIn!=null){
                try {
                    fileIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    } /*
  =======================================================================================================================================================================
     - npi de lo que hay que hacer aqui.*/
    public void generateMobilesFile(String filname){

    }
    /*
 =======================================================================================================================================================================
    - npi de lo que hay que hacer aqui.*/
    public void workEveryone(){

    }

    public static void main(String[] args) {

    }
}
