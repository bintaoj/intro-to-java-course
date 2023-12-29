package com.cbfacademy.shapes;

public abstract class Shape {
    

    private String name;

    //default construtor 
    public Shape(){

    }

    public Shape(String name){
        this.name =name;
    }

     public abstract double getArea();

     public String getName(){

        return name;
     }




}
