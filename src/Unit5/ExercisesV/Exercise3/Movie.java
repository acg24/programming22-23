package Unit5.ExercisesV.Exercise3;

public class Movie {
    private String Mname;
    //duration is in minutes
    private int duration;
    private int year;
    public Movie (String n, int d, int y){
        this.Mname=n;
        this.duration=d;
        this.year=y;
    }
    public String toString(){
        return ("Name: " + this.Mname + "| Duration: " + this.duration
                + ", Year: " + this.year);
    }
    public Boolean isEqual(Movie intro){
        Boolean result=false;
        if (this.Mname.equals(intro.Mname) && this.year ==intro.year
                && (Math.abs(duration-intro.duration)<=5)){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
    public String getMname(){
        return this.Mname;
    }




}
