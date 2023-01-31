package Unit5.ExercisesV.Exercise4;

public class Test {
    public static void main(String[] args) {
        String[] nums0 = new String[]{ "11111","22222","33333","44444","55555"};
        String[] nums1 = new String[]{ "44444","22222","66666","88888","77777"};
        String[] nums2 = new String[]{ "22222","88888","66666","77777","11111"};
        String[] nums3 = new String[]{ "88888","22222","33333","11111","22222"};
        String[] nums4 = new String[]{ "55555","88888","66666","77777","22222"};
        Agenda a0 = new Agenda(4);
        a0.addEntry("jon", nums0);
        a0.addEntry("mikel", nums1);
        a0.addEntry("jone", nums2);
        a0.addEntry("mikele", nums3);
        a0.display();
        a0.addEntry("jon", new String[]{ "55555","88888","66666","77777","22222"});
        a0.display();
        a0.addEntry("iker", nums3);
        System.out.println(a0.searchName("mikele"));
        System.out.println(a0.searchName("alaine"));
        System.out.println("The number " + "111111" + " appears " + a0.numberOfPhones("111111") + " times in the agenda.");
        System.out.println("The number " + "22222" + " appears " + a0.numberOfPhones("22222") + " times in the agenda.");
    }
}
