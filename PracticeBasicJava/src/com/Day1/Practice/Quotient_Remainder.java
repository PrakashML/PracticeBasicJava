package com.Day1.Practice;

import java.util.Scanner;

public class Quotient_Remainder {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers");
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Quotient is:" + x/y);
        System.out.println("Remainder is:"+ x%y);
    }
}
