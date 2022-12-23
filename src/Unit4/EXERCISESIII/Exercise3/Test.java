package Unit4.EXERCISESIII.Exercise3;

public class Test {
    public static void main(String[] args) {
        // Create an instance of Tweety
        Tweety tweety = new Tweety('M', 2, 25, 5);
        // Create an instance of Parrot
        Parrot parrot = new Parrot('M', 10, 'E', "Green");

        // Call the method whoAmI on the Tweety and Parrot instances
        tweety.whoAmI();
        parrot.whoAmI();

        // Call the method height on the Tweety instance
        tweety.height();

        // Call the method whereAreYouFrom on the Parrot instance
        parrot.whereAreYouFrom();

        // Modify the tweety's size and call the method height again
        tweety.size = 35;
        tweety.height();

        // Modify the parrot's region
        parrot.region = 'S';

        // Display the number of birds
        System.out.println("Number of birds: " + Bird.getNumBirds());
    }
}
