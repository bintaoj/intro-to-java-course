package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, double height){
        super("Cylinder");
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return height * Math.PI * Math.pow(radius, 2);
    }
    
}
