package Cylinder;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        if (height<0){
            this.height=0;
        } else{
            this.height=height;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        //I have to ask why [Circle.getArea()] is not working
        //throwing an error of Non static can not be called in Static method.
        return super.getArea()*height;
    }
}
