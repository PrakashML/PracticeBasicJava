package com.Day1.Practice;

import java.util.Scanner;

import java.lang.Math;

public class PowerofTwo {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        N = sc.nextInt();
        if(N<31 && N>=0){
            for(int i=0;i<=N;i++){
                int temp = (int) Math.pow(2,i);
                System.out.println("Two Power of " + i + "=" + temp);
            }
        }
        else{
            System.out.println("Error: Enter a Number Below 31");
        }
    }
}
