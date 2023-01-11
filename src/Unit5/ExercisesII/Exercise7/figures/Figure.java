package Unit5.ExercisesII.Exercise7.figures;

public abstract class Figure {
    private float area;
    private float perimeter;

    public Figure(float a, float p){
        this.area=a;
        this.perimeter=p;
    }
    public float getArea(){
        return this.area;
    }
    public void setArea(float newArea){
        this.area=newArea;
    }
    public float getPerimeter(){
        return this.perimeter;
    }
    public void setPerimeter(float newPerimeter){
        this.perimeter=newPerimeter;
    }
}
