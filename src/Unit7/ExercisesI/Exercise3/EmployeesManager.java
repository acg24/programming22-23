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
     - increments the salary by g and calls m minutes.*/
    public void saveEmployees(List<Employee> employees){
        FileOutputStream fileOut= null;
        ObjectOutputStream output=null;
        try {
            fileOut = new FileOutputStream("media.obj");
            output= new ObjectOutputStream(fileOut);
            for (int i=0;i<employees.size();i++){

                output.writeObjet(employees.get(i));
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
}
