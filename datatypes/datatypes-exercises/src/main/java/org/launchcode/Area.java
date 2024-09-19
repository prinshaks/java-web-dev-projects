package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int rectLength = input.nextInt();
        System.out.println("Enter the width of rectangle");
        int rectWidth = input.nextInt();
        int area=rectLength*rectWidth;
        System.out.println("Area of rectangle=  " + area );
    }
}
