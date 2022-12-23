package Unit4.EXERCISESIII.Exercise3;

public class Canary {
    // Instance attribute
    private double size;

    // Constructor to initialize instance attributes inherited from superclass and size
    public Canary(char sex, int age, double size) {
        super(sex, age);
        this.size = size;
    }

    // Method to display a message depending on the size of the canary
    public void height() {
        if (size > 30) {
            System.out.println("I am a high canary.");
        } else if (size >= 15 && size <= 30) {
            System.out.println("I am a middle canary.");
        } else {
            System.out.println("I am a little canary.");
        }
    }
}
