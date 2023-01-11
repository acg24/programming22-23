package Unit5.ExercisesII.Exercise7.figures;

public class Square extends Figure{
    private int sides;
    private float length;
    public Square(float area,float perimeter,int s, float l){
        super(area,perimeter);
        this.sides=s;
        this.length=l;
    }
}
