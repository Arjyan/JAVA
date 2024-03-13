public class Floor {
    private double width;
    private double length;

    //If we declare another constructor with some parameters default constructor will not initialize automatically
    //we have to initialize manually.
    public Floor(){}

    public Floor(double width,double length){
        if(width<0){
            this.width=0;
        } 
        if(length<0){
            this.length=0;
        } else{
            this.width=width;
        this.length=length;
        }
    }

    public double getArea(){
        return width*length;
    }
}