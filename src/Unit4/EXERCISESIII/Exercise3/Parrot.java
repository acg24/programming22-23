package Unit4.EXERCISESIII.Exercise3;

public class Parrot extends Bird{
    // Instance attributes
    char region;
    private String colour;

    // Constructor to initialize instance attributes inherited from superclass and region and colour
    public Parrot(char sex, int age, char region, String colour) {
        super(sex, age);
        this.region = region;
        this.colour = colour;
    }

    // Method to display the region the parrot is from
    public void whereAreYouFrom() {
        switch (region) {
            case 'N':
                System.out.println("I am from the North.");
                break;
            case 'S':
                System.out.println("I am from the South.");
                break;
            case 'E':
                System.out.println("I am from the East.");
                break;
            case 'W':
                System.out.println("I am from the West.");
                break;
            default:
                System.out.println("Invalid region.");
                break;
        }
    }
}
