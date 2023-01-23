package Unit5.ExercisesV.Exercise3;

import Unit4.InherencieAndVisibility.Exercises1.C;

import java.util.ArrayList;
import java.util.Arrays;

public class Cinema {
    private String Cname;
    private ArrayList<Movie> movies;
    private Movie[] occupiedRooms;

    public Cinema(String c,int numRooms){
        this.Cname=c;
        this.movies = new ArrayList<Movie>();
        this.occupiedRooms=new Movie[numRooms];
        Arrays.fill(occupiedRooms, null);
    }
    public void roomOfMovie(String IntroName, int introDuration, int introYear){
        Movie mIntro = new Movie(IntroName, introDuration, introYear);
    }

}
