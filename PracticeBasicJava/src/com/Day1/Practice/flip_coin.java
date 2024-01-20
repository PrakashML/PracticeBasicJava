package com.Day1.Practice;

import java.util.Scanner;

public class flip_coin {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of the flips");
        num = sc.nextInt();
        int head = 0;
        int tail = 0;
        int headp=0;
        int tailp=0;
        for(int i=0;i<num;i+=1){
            double rand = Math.random();// double datatype will always return values between 0 and 1 in Random
            if(rand<0.5){
                tail+=1;
            }
            else{
                head+=1;
            }
        }
        headp = (head*100)/num;
        System.out.println("Head percentage: " + headp);
        tailp = (tail*100)/num;
        System.out.println("Tail percentage: " + tailp);

    }
}
