package com.twu.hchan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Task 1: Print one asterisk to the console.");
        easiestExerciseEver();
        System.out.println("Task 2: Given a number n, print n asterisks on one line.");
        drawAHorizontalLine(8);
        System.out.println("Task 3: Given a number n, print n lines, each with one asterisks");
        drawAVerticalLine(3);
        System.out.println("Task 4: Given a number n, print n lines, each with one asterisks");
        drawARightTriangle(3);
    }


    public static void easiestExerciseEver(){
        System.out.println("*");
    }

    public static void drawAHorizontalLine(int count){
        for(int i=0; i<count ;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawAVerticalLine(int count){
        for(int i=0; i<count ;i++){
            System.out.println("*");
        }
    }

    public static void drawARightTriangle(int count){
        for(int i=0; i<count ;i++){
            for(int j=0; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
