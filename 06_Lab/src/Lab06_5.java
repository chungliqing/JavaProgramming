public class Lab06_5 {
    static final double PI = 3.142;
    
    public void main(String[] args) {
        double radius = 10;
        System.out.println("Circumference: " + getCircumference(radius));
        System.out.println("Area: " + getArea(radius));
    }

    public double getCircumference(double radius) {
        // 2 * 3.142 * radiuis
        double circumference = 2 * PI * radius;
        return circumference;
    }

    public double getArea(double radius) {
        double area = PI * (radius*radius);
        return area;
    }
}
