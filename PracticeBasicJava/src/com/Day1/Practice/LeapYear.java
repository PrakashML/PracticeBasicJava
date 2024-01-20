package com.Day1.Practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        year = sc.nextInt();
        if(year<10000 && year>999){
            if(year%4==0 && year%100!=0 || year%400==0){
                System.out.println("The Given Year is a LeapYear");
            }
            else{
                System.out.println("The Given Year is not a LeapYear");
            }
        }
        else {
            System.out.println("its is not a year, pls enter a correct year");
        }
    }

}
