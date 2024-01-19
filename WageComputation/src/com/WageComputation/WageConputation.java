package com.WageComputation;

public class WageConputation {
    public static void main(String[] args) {
        int present = 1;
        int wph = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random()*10)%2;
        if(empCheck == present){
            empHrs = 8;
        }
        else{
            empHrs = 0;
        }
        empWage = empHrs * wph;
        System.out.println("Employee Wage: " + empWage);
    }
}
