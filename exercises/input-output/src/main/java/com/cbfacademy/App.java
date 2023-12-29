package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

   


        
//     public static List<String> readFile(String filePath) {
//      filePath = "intro-to-java-course\\exercises\\input-output\\src\\main\\resources\\exercise.txt";
//        List<String>  
    
//     try(
//         FileInputStream file = new FileInputStream(filePath);
//         InputStreamReader reader = new InputStreamReader(file);
//         LineNumberReader lineReader = new LineNumberReader(reader);
//     ) {
//         String outputLine = lineReader.readLine();
//         while (outputLine != null){
//             System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
//             outputLine =lineReader.readLine();
//         }
//     } catch (IOException e) {
//         System.out.println("File reading exception" + e.getMessage());
//     }
// }

    }

    public static List<String> readLinesFromFile(String filePath) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }

        return lines;
}
}
