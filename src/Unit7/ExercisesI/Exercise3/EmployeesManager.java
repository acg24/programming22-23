package Unit7.ExercisesI.Exercise3;

import java.io.*;
import java.util.ArrayList;
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
            fileOut = new FileOutputStream(this.filename);
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
            fileIn = new FileInputStream(this.filename);
            input= new ObjectInputStream(fileIn);

            while (fileIn.available()>0){
                Employee employee=(Employee) input.readObject();
                employee.display();
            }

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
    public Employee searchEmployee(String empname){
        FileInputStream fileIn= null;
        ObjectInputStream input=null;
        boolean find=false;
        Employee result = null;
        try {
            fileIn = new FileInputStream(this.filename);
            input= new ObjectInputStream(fileIn);
            while (fileIn.available()>0 && find!=true){
                Employee employee=(Employee) input.readObject();
                if (employee.getName().equals(empname)){
                    result = employee;
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
        return result;
    } /*
  =======================================================================================================================================================================
     - npi de lo que hay que hacer aqui.*/
    public void generateMobilesFile(String filname){
        FileInputStream fileIn= null;
        ObjectInputStream input=null;
        FileOutputStream fileOut= null;
        ObjectOutputStream output=null;

        try {
            fileIn = new FileInputStream(this.filename);
            input= new ObjectInputStream(fileIn);
            fileOut = new FileOutputStream(new File("mobilePhone.data"));
            output= new ObjectOutputStream(fileOut);
            while (fileIn.available()>0) {
                Employee e=(Employee) input.readObject();
                MobilePhone mp = e.getPhone();
                mp.setCredit(0);
                System.out.println(mp.getNumber());
                output.writeObject(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    /*
 =======================================================================================================================================================================
    - npi de lo que hay que hacer aqui.*/
    public void workEveryone(){
        FileInputStream fileIn= null;
        ObjectInputStream input=null;
        FileOutputStream fileOut= null;
        ObjectOutputStream output=null;
        try {
            fileIn = new FileInputStream(this.filename);
            input= new ObjectInputStream(fileIn);
            fileOut = new FileOutputStream(this.filename);
            output= new ObjectOutputStream(fileOut);
            List<Employee> employees=new ArrayList<Employee>();
            while (fileIn.available()>0) {
                Employee employee = (Employee) input.readObject();
                employee.work();
                employees.add(employee);
            }
            saveEmployees(employees);
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
            if (fileOut!=null){
                try {
                    fileOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        MobilePhone mp0=new MobilePhone("111",0.0);
        MobilePhone mp1=new MobilePhone("222",0.0);
        MobilePhone mp2=new MobilePhone("333",0.0);
        MobilePhone mp3=new MobilePhone("444",0.0);

        Employee e0=new Employee("xxxx",0.0, mp0);
        Employee e1=new Employee("aaaa",0.0, mp1);
        Employee e2=new Employee("bbbb",0.0, mp2);
        Employee e3=new Employee("cccc",0.0, mp3);
        Employee e4=new Employee("dddd",0.0, mp3);

        List<Employee> el0=new ArrayList<Employee>();
        el0.add(e0);
        el0.add(e1);
        el0.add(e2);
        el0.add(e3);
        el0.add(e4);
        EmployeesManager em0=new EmployeesManager("employees.data");
        System.out.println("================================================================================");
        System.out.println("Saving employees");
        em0.saveEmployees(el0);
        System.out.println("================================================================================");
        System.out.println("Searching employee: xxxx");
        System.out.println(em0.searchEmployee("xxxx"));
        System.out.println("================================================================================");
        System.out.println("Searching employee: yyyy");
        System.out.println(em0.searchEmployee("yyyy"));
        System.out.println("================================================================================");
        System.out.println("Displaying");
        em0.displayEmployees();
        System.out.println("================================================================================");
        System.out.println("mobile phones:");
        em0.generateMobilesFile("employees.data");
        System.out.println("================================================================================");
        System.out.println("working all");
        em0.workEveryone();
        System.out.println("================================================================================");
        System.out.println("Displaying");
        em0.displayEmployees();

    }

}
