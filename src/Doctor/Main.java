package Doctor;

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor("Mario");
        d.treatPatient();
        FamilyDoctor fd = new FamilyDoctor("MORALES");
        fd.giveAdvice();
        fd.giveAdvice();
        Surgeon s = new Surgeon("Matamoros");
        s.treatPatient();
        s.makeIncision();

    }
}
