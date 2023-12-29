package com.cbfacademy.shapes;

public class Sphere extends Shape {

    private double radius;

    public Sphere(){

    }

    public Sphere(double radius){
        super("Sphere");
        this.radius = radius;
    } 



    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    
}
