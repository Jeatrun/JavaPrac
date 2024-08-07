package day15.Q1;

public class Round extends Shape{
    private double radius;
    
    public Round(double radius) {
        this.radius = radius;
    }
    private final double PI = 3.14;

    @Override
    public double area() {
        return PI * radius * radius;
    }
    @Override
    public double perimeter(){
        return 2 * PI * radius;
    }
}
