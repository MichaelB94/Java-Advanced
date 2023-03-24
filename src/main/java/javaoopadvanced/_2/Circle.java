package javaoopadvanced._2;

public class Circle extends Shape {
    Circle(double radius){
        super(radius,radius);
    }
@Override
    public double getArea(){
        return Math.PI*Math.pow(getHeight()/2,2);
    }

}
//BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
