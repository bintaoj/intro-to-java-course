package com.cbfacademy;

import com.cbfacademy.cars.Showroom;

import java.util.List;

import com.cbfacademy.cars.Car;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Showroom myShowroom = new Showroom();

        List<Car> cars = myShowroom.getCars();

        for  (Car car : cars){
        System.out.println(car.getDetails());
       }

       
         
    


    }
}
