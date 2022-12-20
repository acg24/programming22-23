package Unit4.EXERCISESIII.Exercise1.items;

public abstract class Item {
    private int code;
    private String title;
    private String author;
    public Item(int c, String t, String a){
        this.code=c;
        this.title=t;
        this.author=a;
    }
    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public void show(){
        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
