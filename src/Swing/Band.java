package Swing;
public class Band {
    private String group;
    private String CD;

    public Band(String group, String CD) {
        this.group = group;
        this.CD = CD;
    }

    public String getGroup() {
        return group;
    }

    public String getCD() {
        return CD;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }

    public String toString() {
        return group;
    }
}
