package Unit5.ExercisesV.Exercise3;

import Unit4.InherencieAndVisibility.Exercises1.C;
import Unit5.ExercisesV.Exercise2.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
        int i=0;
        Movie obj = movies.get(0);
        boolean isIn=false;
        while (isIn ==false || i < this.movies.size()){
            i++;
            if (mIntro.equals(obj)){
                System.out.println("The movie is  being projected in the room number" + (i+1));
                isIn =true;
            }
        }
        if (isIn==false){
            System.out.println("The movie is not in this cinema.");
        }
    }
    public void addMovie(Movie introM){
        Iterator<Movie> it = movies.iterator();
        boolean isEmpty = false;
        while(it.hasNext()) {
            Movie obj = it.next();
            if (obj==null){
                obj=introM;
                isEmpty = true;
            }
        }
        boolean isIn=false;
        for (int i = 0; i < this.movies.size(); i++) {
            Movie obj = movies.get(i);
            if (introM.equals(obj)){
                isIn =true;
            }
        }
        if (isEmpty==true && isIn==false){
            System.out.println("The movie is added successfully.");
        }else if (isIn==true){
            System.out.println("The movie is already in this cinema.");
        }else{
            System.out.println("There are no empty rooms, remove a movie if you want to add another.");
        }
    }
    public void addMovie(Movie introM, int room){
        room=room-1;
        boolean isIn=false;
        for (int i = 0; i < this.movies.size(); i++) {
            Movie obj = movies.get(i);
            if (introM.equals(obj)){
                isIn =true;
            }
        }
        if (movies.get(room)==null && isIn==false){
            movies.add(room , introM);
            System.out.println("The movie is added successfully.");
        }else if (isIn==true){
            System.out.println("The movie is already in this cinema.");
        }else{
            System.out.println("The room is not empty.");
        }
    }
    public void display(){
        System.out.println(this.Cname + ": ");
        for (int i = 0; i < this.movies.size(); i++) {
            Movie obj = movies.get(i);
            if (movies.get(i)!=null){
                System.out.println(obj.getMname() + " -Room " + (i+1));
            }
        }
    }


}
