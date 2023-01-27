package Unit5.ExercisesV.Exercise4;

public class Test {
    public static void main(String[] args) {
        String[] nums0 = new String[]{ "11111","222222","33333","44444","55555"};
        String[] nums1 = new String[]{ "44444","444444","66666","88888","77777"};
        String[] nums2 = new String[]{ "77777","888888","66666","77777","11111"};
        String[] nums3 = new String[]{ "88888","222222","33333","11111","22222"};
        String[] nums4 = new String[]{ "55555","888888","66666","77777","22222"};
        Agenda a0 = new Agenda(4);
        a0.addEntry("jon", nums0);
        a0.addEntry("mikel", nums1);
        a0.addEntry("jone", nums2);
        a0.addEntry("mikele", nums3);
        a0.display();
        a0.addEntry("jon", nums4);
        a0.display();
        a0.addEntry("iker", nums3);
        a0.searchName("mikele");
        a0.searchName("alaine");
    }
}
