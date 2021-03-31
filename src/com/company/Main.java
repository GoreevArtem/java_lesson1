package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Ты хочешь покушац пиццу?");
        String text = input.nextLine();
        if (text.toUpperCase().equals("ДА"))
            System.out.println("Пицца приготовлена, кушац подано!");
        else if (text.toUpperCase().equals("НЕТ"))
            System.out.println("Пока!");
        else
            System.out.println("You entered the data incorrectly");
    }
}
