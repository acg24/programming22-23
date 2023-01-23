package Unit5.ExercisesV.Exercise2;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.Objects;

public class Point implements Comparable<Point>{
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point){
            Point p0 = (Point) obj;
            return this.x == p0.x && this.y == p0.y;
        }
        return false;
    }

    @Override
    public int compareTo(Point p0) {
        if (this.x == p0.x && this.y == p0.y) {
            return 0;
        } else {
            return -1;
        }
    }
    public int hashCode() {
        return Objects.hash(this.x,this.y);
    }
}
