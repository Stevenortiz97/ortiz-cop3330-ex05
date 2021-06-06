/*
 *  UCF COP3330 Summer 2021 Assignment 5
 *  Copyright 2021 Steven Ortiz
 */

// What is the first number? 10
//What is the second number? 5
// 10 + 5 = 15
// 10 - 5 = 5
//10 * 5 = 50
//10 / 5 = 2

package org.example;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    private static int numberone(){
        System.out.print("What is the first number? ");
        String numberone = in.nextLine();
        int num1 = Integer.parseInt(numberone);
        return num1;
    }

    private static int numbertwo() {
        System.out.print("What is the second number? ");
        String numbertwo = in.nextLine();
        int num2 = Integer.parseInt(numbertwo);
        return num2;


    }

    public static void main(String[] args) {

        int num1 = numberone();
        int num2 = numbertwo();

        int sum = num1 + num2;
        int dif = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println(""+num1+" + "+num2+" = "+sum);
        System.out.println(""+num1+" - "+num2+" = "+dif);
        System.out.println(""+num1+" * "+num2+" = "+mul);
        System.out.println(""+num1+" / "+num2+" = "+div);



    }
    private static void printOutput(String outputString){
        System.out.println(outputString);
    }




}