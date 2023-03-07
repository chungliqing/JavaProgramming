package pkg09_lab;

public class Sphere extends Circle {
    
    public Sphere(){
        super(); //calls the default constructor of its parent class, circle
        //default radius = 5
    }
    
    public Sphere(double radius){
        super(radius);
    }
    
    public double getVolume(){
        return (4 * Math.PI * Math.pow(getRadius(), 3))/3;
    }
            
}
