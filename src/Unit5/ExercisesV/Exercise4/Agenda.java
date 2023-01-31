package Unit5.ExercisesV.Exercise4;
import Unit5.ExercisesV.Exercise3.Movie;

import java.util.*;

public class Agenda {
    private HashMap <String,String[]> entries;
    private int maxPer;
    public Agenda (int mn){
        this.maxPer=mn;
        this.entries = new HashMap<String,String[]>();
    }

    /*
    =======================================================================================================================================================================
       -Intro (a name and an array with phone numbers) and add it to the agenda.*/
    public void addEntry(String name, String[] nums){

        boolean isIn=false;
        int inPer=0;
        if (entries.containsKey(name)){
            isIn=true;
        }
        Iterator<Map.Entry<String,String[]>> it=entries.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String[]> map=(Map.Entry<String,String[]>) it.next();
            inPer++;
            //System.out.println(map.getKey()+ " " + map.getValue());
        }
        if (isIn ==true){
            Scanner s0 = new Scanner(System.in);
            System.out.println();
            System.out.println("============================================================================");
            System.out.println("Your agenda contains these phone number for.");
            System.out.print(name + ":  ");
            while (it.hasNext()) {

                Map.Entry<String, String[]> map = (Map.Entry<String, String[]>) it.next();
                inPer++;
                for (int i = 0; i < entries.get(name).length; i++) {
                    System.out.print(entries.get(name)[i] + ", ");
                }
            }
            System.out.println("Want to replace them by new ones?(y/n)");
            String answer = s0.nextLine();
            if (answer.equals("y")){
                entries.replace(name, nums);
            } else if (answer.equals("n")) {
                System.out.println("The numbers have not been replaced.");
            }
        } else if (isIn==false && inPer<maxPer) {
            entries.put(name, nums);
            System.out.println(name + (" is added to the agenda."));
        }else if(isIn==false && inPer>=maxPer){
            System.out.println("Full agenda");
        }
    }
    public void display(){
        Iterator<Map.Entry<String,String[]>> it=entries.entrySet().iterator();
        System.out.println();
        System.out.println("===================================AGENDA===================================");
        while (it.hasNext()){
            Map.Entry<String,String[]> map=(Map.Entry<String,String[]>) it.next();
            System.out.print(map.getKey()+ ": ");
            for (int i=0; i<map.getValue().length;i++){
                System.out.print(map.getValue()[i] + ", ");
            }
            System.out.println();
        }
    }
    public String  searchName(String name){
        String result="";
        System.out.println();
        System.out.println("============================================================================");
        boolean isIn=false;
        if (entries.containsKey(name)){
            System.out.print(name + ": ");
            for (int i=0; i<entries.get(name).length;i++){
                result=result + (entries.get(name)[i] + ", ");
            }
            System.out.println();
        } else if (!entries.containsKey(name)) {
            result = (name + " is not in the agenda");
        }
        return result;
    }
    public int numberOfPhones(String num){
        int result =0;
        Iterator<Map.Entry<String,String[]>> it=entries.entrySet().iterator();
        System.out.println();
        System.out.println("============================================================================");
        while (it.hasNext()){
            Map.Entry<String,String[]> map=(Map.Entry<String,String[]>) it.next();
            for (int i=0; i<map.getValue().length;i++){
                if (map.getValue()[i].equals(num)){
                    result++;

                }
            }
        }
            return result;
    }

}
