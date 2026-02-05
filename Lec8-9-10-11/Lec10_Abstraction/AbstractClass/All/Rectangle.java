package Lec10_Abstraction.AbstractClass.All;

public class Rectangle extends Shape {

    double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }
}