package org.launchcode;

import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length = input.nextInt();

        System.out.println("Enter the width of the rectangle");
        width = input.nextInt();
        input.close();
        area = width * length;
        System.out.println("The area is " + area);

    }
}

