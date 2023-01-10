package Unit4.Doctor;

public class Doctor {
    private String wHosp;

    public String getwHosp() {
        return wHosp;
    }

    public void setwHosp(String wHosp) {
        this.wHosp = wHosp;
    }

    public Doctor(String wHosp){
        this.wHosp=wHosp;
    }
    public void treatPatient(){
        System.out.println("i am doctir wirking at" + this.wHosp);
    }

}
