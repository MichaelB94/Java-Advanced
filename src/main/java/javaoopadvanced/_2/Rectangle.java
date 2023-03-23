package javaoopadvanced._2;

public class Rectangle extends Shape{
    Rectangle(double height, double width){
        super(height, width);
    }

    @Override
    public double getArea(){
        return getWidth() * getHeight();
    }
}

