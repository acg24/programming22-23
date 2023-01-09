package Unit5.ExercisesII.Exercise2;

public class Bird {
    // Instance attributes
    private char sex;
    private int age;
    // Class attribute to save the current number of birds
    private static int numBirds = 0;

    // Constructor to initialize instance attributes
    public Bird(char sex, int age) {
        this.sex = sex;
        this.age = age;
        numBirds++;
    }

    // Method to return the current number of birds
    public static int getNumBirds() {
        return numBirds;
    }

    // Method to display the values of the instance attributes
    public void whoAmI() {
        System.out.println("I am a bird. My sex is " + sex + " and my age is " + age + ".");
    }
}
