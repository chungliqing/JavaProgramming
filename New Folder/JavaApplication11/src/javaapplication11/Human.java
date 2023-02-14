package javaapplication11;

public class Human {
    private String name, gender;
    private int age;
    
    public Human(){ //overloading implementation; double constructor with vaiours implementation
        
    }
    
    public Human(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    
    public Human(int age){
        this.age = age;
    }
    
    public Human(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }  
}
