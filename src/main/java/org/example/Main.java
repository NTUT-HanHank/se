package org.example;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enetr the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int score = Integer.parseInt(br.readLine());
            char grade = new letterGrade().letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        }catch (NumberFormatException ex){
            System.out.println("Not an integer!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}