package Unit5.ExercisesV.Exercise2;

import java.util.*;

public class Exercise {
    private ArrayList<Point> points=new ArrayList<Point>();
    public Exercise(){
        Point p0 = new Point(2,4);
        Point p1 = new Point(4,4);
        Point p2 = new Point(5,3);
        Point p3 = new Point(6,7);
        points.add(p0);
        points.add(p1);
        points.add(p2);
        points.add(p3);
    }
    public Exercise(ArrayList<Point> ps0){
        this.points=ps0;
    }
    public void displaying(){
        for (Point p : points) {
          System.out.println(p.toString() + "| ");
        }
    }
    public ArrayList<Point> reverse(){
        // Con collections no le mola.
        /*
        ArrayList<Point> result = new Arraylist<>();
        Collections.copy(result, this.points);
        Collections.reverse(result);
        return result;
         */
        ArrayList<Point> result= new ArrayList<Point>();
        for (int i = 0; i < points.size(); i++) {
            result.add(points.get(i));
        }
        return result;
    }
    public Point firstOfCuadrant2(){
        Iterator<Point> it = points.iterator();
        boolean find = false;
        Point result=null;
        while(it.hasNext() && !find) {
            Point obj = it.next();
            if (obj.getX()<0 && obj.getY()>0){
                find=true;
                result=obj;

            }
        }
        if (!find){
            result=null;
            System.out.println("There is not a number in the second cuadrant.");
        }
        return result;
    }
    public void displayIndexOfFirst00() {
        Point base = new Point(0, 0);
        for (int i = 0; i < points.size(); i++) {
            Point point = points.get(i);
            if (point.compareTo(base) == 0) {
                System.out.println("The first (0,0) point is at index " + i);
                return;
            }
        }
        System.out.println("The ArrayList does not contain any (0,0) point.");
    }
    public Boolean isPoint11In() {
        Point base = new Point(1, 1);
        for (int i = 0; i < points.size(); i++) {
            Point point = points.get(i);
            if (point.compareTo(base) == 0) {
                System.out.println("The first (0,0) point is at index " + i);

            }
        }
        System.out.println("The ArrayList does not contain any (0,0) point.");
        return true;
    }
    public boolean isIn11() {
        Iterator<Point> it = points.iterator();
        Point base = new Point(1, 1);
        boolean isIn=false;
        while(it.hasNext()) {
            Point obj = it.next();
            if (obj.hashCode()==0){
                isIn=true;
            }
        }
        return isIn;
    }


}
