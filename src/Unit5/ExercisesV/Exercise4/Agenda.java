package Unit5.ExercisesV.Exercise4;
import Unit5.ExercisesV.Exercise3.Movie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Agenda {
    private HashMap <String,String[]> entries;
    private int maxPer;
    public Agenda (int mn){
        this.maxPer=mn;
        this.entries = new HashMap<String,String[]>();
    }
    public void addEntry(String name, String[] nums){
        Iterator<Map.Entry<String,String[]>> it=entries.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String[]> map=(Map.Entry<String,String[]>) it.next();
            //System.out.println(map.getKey()+ " " + map.getValue());
        }
    }
}
