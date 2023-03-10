/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09_lab;

/**
 *
 * @author chung
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle = new Circle();
        
        Cylinder cylinder = new Cylinder();
        Cylinder cylinder2 = new Cylinder(6);
        Cylinder cylinder3 = new Cylinder(3, 10);
        System.out.println(cylinder3.getVolume());
        
        
        circle.setRadius(3);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        
        Sphere sp1 = new Sphere(); //invoke default constructor
        Sphere sp2 = new Sphere(7); // invoke the 2nd constructors
        System.out.println("SP1 " + sp1.getRadius());
        System.out.println("SP2 " + sp2.getVolume());
    }
    
}
