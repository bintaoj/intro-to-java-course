package com.cbfacademy.shapes;

public class Square implements Enclosure{
    
    private double width;

    public Square(){

    }

    public Square(double width){
        this.width = width;
    }

    



    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimeter'");
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }

}

// with a width attribute
// and it implements the Enclosure interface