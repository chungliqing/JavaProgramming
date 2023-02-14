/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09_lab;

/**
 *
 * @author chung
 */
public class Circle {
    private double radius;
    final double PI = 3.14;
    
    public Circle(){
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;   
    }
    
    public double getRadius(){
        return radius;
    }
 
    public double getArea(){
        return PI * Math.pow(radius, 2);
    }
}
