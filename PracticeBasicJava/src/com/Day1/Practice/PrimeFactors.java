package com.Day1.Practice;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class PrimeFactors {
     public static int is_prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to find the prime factors");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        for(int i=2;i<=Num;i++){
            if(is_prime(i) == 1 && Num%i == 0){
                System.out.println(i);
            }
        }
    }
}
