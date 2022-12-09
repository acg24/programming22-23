package Doctor;

public class FamilyDoctor extends Doctor{

    private int nCalls;
    public FamilyDoctor(String wHosp) {
        super(wHosp);
        this.nCalls=0;
    }
    boolean makesHouseCalls;

    public void giveAdvice(){
        this.nCalls++;
        System.out.println("this is call " +
                nCalls + " I'm giving advice ");
    };
}
