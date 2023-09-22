import java.util.*;
import java.io.*;

public class abstracted {
    public static void main(String args[]){
            circle a=new circle(2.5);
            rectangle b=new rectangle(5.6,2.8);
            double area1=a.calculateArea();
            double area2=b.calculateArea();
            System.out.println("area of circle : "+area1);
            System.out.println("area of rectangle : "+area2);
    }
}

abstract class shape{
    public abstract double calculateArea();
}
class circle extends shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class rectangle extends shape{
    private double width;
    private double length;
    public rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    @Override
    public double calculateArea(){
        return length*width;
    }
}
