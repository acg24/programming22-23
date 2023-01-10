package Unit4.Doctor;

public class Surgeon extends Doctor{

    public Surgeon(String wHosp) {
        super(wHosp);
    }
    @Override
    public void treatPatient(){
        super.treatPatient();
        System.out.println("iḿ doing a surgeon");
    };
    void makeIncision(){
        System.out.println("Yikers");
    }
}
