package com.Day1.Practice;

import java.util.Scanner;

public class Largest_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = sc.nextInt();
        System.out.println("Enter Second Number");
        int y = sc.nextInt();
        System.out.println("Enter Third Number");
        int z = sc.nextInt();
        int temp = 0;
        temp = x>y?x:y;
        temp = z>temp?z:temp;
        System.out.println(temp);

    }
}
