package Unit5.ExercisesV.Exercise2;

public class Point {
    private int x;
    private int y;
    public Point(int X, int Y){
        this.x=X;
        this.y=Y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String toString(){
        String result=("The point is: " + this.x + ", " + this.y);
        return result;
    }
}
