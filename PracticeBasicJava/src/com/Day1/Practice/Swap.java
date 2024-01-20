package com.Day1.Practice;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter any two numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }
}
