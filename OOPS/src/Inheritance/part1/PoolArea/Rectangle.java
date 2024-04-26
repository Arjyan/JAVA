package PoolArea;

public class Rectangle {
    // write code here
    private double width;
    private double length;

    public Rectangle(double width,double length){
        if(width<0){
            this.width=0;
        }if(length<0){
            this.length=0;
        }
            this.width=width;
            this.length=length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return width*length;
    }

}
