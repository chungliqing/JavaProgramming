package pkg09_lab;

public class Sphere extends Circle {
    
    public double getVolume(){
        return (4 * Math.PI * Math.pow(getRadius(), 3))/3;
    }
            
}
