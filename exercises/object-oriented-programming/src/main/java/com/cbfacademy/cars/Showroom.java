package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    public  List<Car> getCars(){
     Car blueVolvo = new Car("Volvo","v40", "Blue", 2012);
     Car redPorsche = new Car("Porsche","Panamera", "Red", 2009 );
     Car greyAudi = new Car("Audi","A3", "Grey", 2018 );
  
  
    List<Car> carList = new ArrayList<>();
   
    carList.add(greyAudi);
    carList.add(blueVolvo);
    carList.add(redPorsche);
    
    return carList;
}  
}
