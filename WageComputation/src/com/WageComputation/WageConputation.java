package com.WageComputation;

public class WageConputation {
    public static final int Part_t = 1;
    public static final int Full_t = 2;
    public static final int wph = 20;

    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random()*10)%2;
        switch ((int) empCheck){
            case Part_t:
                empHrs = 4;
                break;
            case Full_t:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * wph;
        System.out.println("Employee Wage: " + empWage);
    }
}
