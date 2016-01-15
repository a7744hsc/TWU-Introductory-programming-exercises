package com.twu.hchan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Task 1: Print one asterisk to the console.");
        easiestExerciseEver();
        System.out.println("Task 2: Given a number n, print n asterisks on one line.");
        drawAHorizontalLine(8);
        System.out.println("Task 3: Given a number n, print n lines, each with one asterisks.");
        drawAVerticalLine(3);
        System.out.println("Task 4: Given a number n, print n lines, each with one more asterisk than the last.");
        drawARightTriangle(3);
        System.out.println("Task 5: Given a number n, print a centered triangle.");
        isoscelesTriangle(3);
        System.out.println("Task 6: Given a number n, print a centered diamond.");
        diamond(3);

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

    public static void isoscelesTriangle(int count){
        for(int i=1; i<=count ;i++){
            for(int k=count-i; k>0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int count){
        for(int i=1; i<=count ;i++){
            for(int k=count-i; k>0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=count-1; i>0 ;i--){
            for(int k=count-i; k>0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
