package com.cbfacademy.shapes;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(){

    }

    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
       return length * width;
    }
    
}
