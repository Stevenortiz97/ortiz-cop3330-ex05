/*
 *  UCF COP3330 Summer 2021 Assignment 5
 *  Copyright 2021 Steven Ortiz
 */

//Enter a noun: dog
//Enter a verb: walk
// Enter an adjective: blue
// Enter an adverb: quickly
// Do you walk your blue dog quickly? That's hilarious!

package org.example;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);



    public static void main(String[] args) {

        String noun = nounWord();
        String verb = verbWord();
        String adjective = adjectiveWord();
        String adverb = adverbWord();

        String outputString = generateOutputString(noun,verb,adjective,adverb);
        printOutput(outputString);

    }
    private static void printOutput(String outputString){
        System.out.println(outputString);
    }

    private static String nounWord(){
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        return noun;
    }
    private static String verbWord() {
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        return verb;

    }
    private static String adjectiveWord() {
        System.out.print("Enter an adjective: ");
        String adjective = in.nextLine();
        return adjective;
    }

    private static String adverbWord() {
        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();
        return adverb;
    }


    private static String generateOutputString(String noun, String verb, String adjective, String adverb) {


        return "Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!";

    }
}