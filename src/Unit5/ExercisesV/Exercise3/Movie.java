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
    public void isEqual(Movie intro){
        if (this.Mname.equals(intro.Mname) && this.year ==intro.year
                && (Math.abs(duration-intro.duration)<=5)){
            System.out.println("They are the same movie.");
        }else{
            System.out.println("They are not the same movie.");
        }
    }




}
