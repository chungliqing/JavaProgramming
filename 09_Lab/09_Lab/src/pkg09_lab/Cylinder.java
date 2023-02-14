/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09_lab;

/**
 *
 * @author chung
 */
public class Cylinder extends Circle {
    private double height;
    
    public Cylinder(){
        super(); //default value
        height = 8; //default value
    }
    
    public Cylinder(double height){
        super(); //default radius
        this.height = height;
    }
    
    public Cylinder(double radius, double height){
        super(radius); //new value
        setRadius(radius);
        this.height = height;  
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getArea(){
        return (2 * Math.PI * getRadius() * height) + (2 * super.getArea());
    }
    
    public double getVolume(){
        return super.getArea() * height;
    } 
    
    
    
    
     
}
