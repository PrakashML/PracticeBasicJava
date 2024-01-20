package com.demo.oops;
// class is a named group of properties and functions
// to create your own datatype use classes

public class StudentDetails {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        String[] name = new String[10];
        float[] marks = new float[5];

        Student[] students = new Student[5];

    }

    // objects is an instance of a class
    // classes are the blueprint of the object
    // class is a logical constant
    // object is a physical reality
    static class Student{
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
    }
}
