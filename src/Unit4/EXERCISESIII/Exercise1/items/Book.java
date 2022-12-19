package Unit4.EXERCISESIII.Exercise1.items;

public class Book extends Item {
    private int numPages;
    public Books(int n, int c, String t, String a){
        super(code, title, author);
        this.numPages=n;
    }
    public void show(){
        System.out.println();
    }
    public void fullCode(){
        System.out.println(this.code + this.title + this.numPages);
    }
}
