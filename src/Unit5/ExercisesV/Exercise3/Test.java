package Unit5.ExercisesV.Exercise3;

public class Test {
    public static void main(String[] args) {
        Movie m0 = new Movie("Django Unchained" ,120,2014);
        Movie m1 = new Movie("Les Misérables" ,89,2014);
        Movie m2 = new Movie("Argo" ,60,2014);
        Movie m3 = new Movie("El menú" ,92,2022);
        Movie m4 = new Movie("Capitana Marvel" ,120,2020);
        Cinema c0 = new Cinema("Principe" , 5);
        c0.addMovie(m0);
        c0.addMovie(m1);
        c0.addMovie(m2);
        c0.addMovie(m3);
        c0.addMovie(m4);
        c0.display();


    }
}
