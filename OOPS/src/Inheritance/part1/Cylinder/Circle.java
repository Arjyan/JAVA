package Cylinder;

// package inheritance.Cylinder;

public class Circle {
    // write code here
    private double radius;

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.round(radius*radius*Math.PI);
    }


    public  Circle (double radius){
        if (radius<0){
            this.radius=0;
        } else{
            this.radius=radius;
        }
    }
}
