package Unit5.ExercisesV.Exercise2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        //ArrayList<Point> result = Collections.reverse(this.points);
        ArrayList<Point> result= new ArrayList<Point>();
        for (int i = 0; i < points.size(); i++) {
            result.add(points.get(i));
        }
        return result;
    }
    public Point firstOfCuadrant2(){
        Iterator<Point> it = points.iterator();
        boolean find = false;
        while(it.hasNext()) {
            Point obj = it.next();
            if (obj.getX()<0 && obj.getY()>0){
                return obj;
            }
        }return null;
    }
    

}
