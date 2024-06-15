package entities;

import entities.enums.Color;

public class Circle extends Shape{
    private Double radius;



    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }


    public Circle(Color color, Double radius) {
        super(color);
        setRadius(radius);
    }


    @Override
    public Double area() { return Math.PI * Math.pow(radius, 2); }
}
