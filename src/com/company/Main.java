package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    System.out.println("Do you want pizza?");
	    String text = input.nextLine();
	    if (text.toUpperCase().equals("YES"))
            System.out.println("I'm gonna go make your pizza");
        else if (text.toUpperCase().equals("NO"))
            System.out.println("Good bye");
    }
}
