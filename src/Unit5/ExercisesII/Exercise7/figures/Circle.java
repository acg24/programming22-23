package Unit5.ExercisesII.Exercise7.figures;

public class Circle extends Figure{
    private int sides;
    private float length;
    public Circle(float area,float perimeter,int s, float l){
        super(area,perimeter);
        this.sides=s;
        this.length=l;
    }
}
