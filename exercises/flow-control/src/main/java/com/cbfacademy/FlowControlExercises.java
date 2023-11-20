package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        List<String>f_BList = new ArrayList<>();
        //  it creates a list where for each element of the input list ${numbers}
        for (Integer number : numbers) {
             //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
            if (number % 3 == 0 && number % 5 == 0) {
                f_BList.add("FizzBuzz");
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
            }else if (number % 5 == 0){
                f_BList.add("Buzz");
         //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list        
            }else if (number % 3 == 0){
                f_BList.add("Fizz");
        //  - it adds the element to the list in any other case        
            }else{
                f_BList.add(String.valueOf(number));
            }
        }
        //  - it returns the constructed List
        return f_BList;
        //throw new RuntimeException("Not implemented");
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        throw new RuntimeException("Not implemented");
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
