package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the points: ");
        int x = myObj.nextInt();
        System.out.println("Enter total points: ");
        int y = myObj.nextInt();
        double divide = Divide(x, y);
        System.out.println(divide);


        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static double Divide(int x, int y) {
        double i;
        i = x/ y;
        try {
            if (y == 0) {
                throw new ArithmeticException("invalid_division");
            } else {
                return i;
            }
        } catch (ArithmeticException invalid_division) {
            System.out.println("invalid_division");
        }
        return i;
    }

//    public static int CheckFileExtension(String fileName)
//    {
//        // Write code here!
//    }
}