package Unit4.EXERCISESIII.Exercise1.orders;

public class Client {private int idNumber;
    private String name;

    public Client(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }
    public void show() {
        System.out.println(getIdNumber());
        System.out.println(getName());
        System.out.println(getName() + " ");
        System.out.println(getName() + " do the order.");
    }

}
