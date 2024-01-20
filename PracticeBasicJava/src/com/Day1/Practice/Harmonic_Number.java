package com.Day1.Practice;

import java.util.Scanner;

public class Harmonic_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        if(N>0){
            for(int i=1;i<=N;i++){
                sum = sum + (1/i);
            }
            System.out.println(sum);
        }
        else {
            System.out.println("error!! Not Valid");
        }

    }
}
