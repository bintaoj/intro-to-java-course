package com.cbfacademy.shapes;

public class Circle implements Enclosure  {

    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }



    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return Math.PI * radius *radius;
    }

   

}

// with a radius attribute
// and it implements the Enclosure interface