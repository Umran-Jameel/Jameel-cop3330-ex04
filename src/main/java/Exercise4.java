/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        String str = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
        System.out.println(str);

    }
}
