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

    /*
    =======================================================================================================================================================================
       -Intro a movie and returns in witch room is it located.
       -Iterate occupiedRooms.*/
    public void roomOfMovie(String IntroName, int introDuration, int introYear){
        Movie mIntro = new Movie(IntroName, introDuration, introYear);
        boolean isIn=false;
        int i=0;
        while (i<occupiedRooms.length && isIn!=true){
            if (mIntro.isEqual(this.occupiedRooms[i])){
                System.out.println("The movie is  being projected in the room number" + (i+1));
                isIn =true;
            }
            i++;
        }
        if (isIn==false){
            System.out.println("The movie is not in this cinema.");
        }

    }

    /*
    =======================================================================================================================================================================
       -Intro a movie and add to the first available room.
       -Iterate occupiedRooms.*/
    public void addMovie(Movie introM){
        boolean isEmpty = false;
        boolean isIn=false;
        int i=0;
        while (i<occupiedRooms.length && isIn!=true && isEmpty!=true){
            if (occupiedRooms[i]==null){
                isEmpty = true;
            }
            if (introM.equals(occupiedRooms[i])){
                isIn =true;
            }
            i++;
        }
        if (isEmpty==true && isIn==false){
            occupiedRooms[i]=introM;
            System.out.println("The movie is added successfully.");
        }else if (isIn==true){
            System.out.println("The movie is already in this cinema.");
        }else{
            System.out.println("There are no empty rooms, remove a movie if you want to add another.");
        }
    }

    /*
    =======================================================================================================================================================================
       -Intro (a movie and a room) and add the movie to the room.
       -Iterate occupiedRooms.*/
    public void addMovie(Movie introM, int room){
        room=room-1;
        boolean isEmpty = false;
        boolean isIn=false;
        int i=0;
        while (i<occupiedRooms.length && isIn!=true && isEmpty!=true){
            if (occupiedRooms[i]==null){
                isEmpty = true;
            }
            if (introM.equals(occupiedRooms[i])){
                isIn =true;
            }
            i++;
        }
        if (isEmpty==true && isIn==false){
            movies.add(room , introM);
            System.out.println("The movie is added successfully.");
        }else if (isIn==true){
            System.out.println("The movie is already in this cinema.");
        }else{
            System.out.println("There are no empty rooms, remove a movie if you want to add another.");
        }
    }

    /*
    =======================================================================================================================================================================
       -Display the cinema Cname and the name of all the movies that are in a room(the room to).
       -Iterate occupiedRooms.*/
    public void display(){
        System.out.println(this.Cname + ": ");
        for (int i = 0; i < this.occupiedRooms.length; i++) {
            if (occupiedRooms[i]!=null){
                System.out.println(occupiedRooms[i].getMname() + " -Room " + (i+1));
            }
        }
    }


}
