package com.cbfacademy.shapes;

public class Paint {
   
    private double coverage;

    public Paint(){

    }

    public Paint(double coverage){

        this.coverage = coverage;
    }

    public double calculatePaint(Shape shape) {
        if (shape == null) {
           System.out.println("Shape cannot be null");
        }

        double area = shape.getArea();
        return area * coverage * 0.01;
    }
    

    public double getAmount(Shape shape){

      return calculatePaint(shape);
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }
}
