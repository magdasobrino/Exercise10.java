/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */


import java.util.Scanner;
import java.lang.*;
public class Exercise10 {
    public static void main(String[] args){
        double taxRate = 0.055;
        double price1, price2, price3, quantity1, quantity2, quantity3;
        double subtotal, tax, total;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the price of item 1:");
        price1 = scnr.nextDouble();
        System.out.println("Enter the quantity of item 1:");
        quantity1 = scnr.nextDouble();

        System.out.println("Enter the price of item 2:");
        price2 = scnr.nextDouble();
        System.out.println("Enter the quantity of item 2:");
        quantity2 = scnr.nextDouble();

        System.out.println("Enter the price of item 3:");
        price3 = scnr.nextDouble();
        System.out.println("Enter the quantity of item 3:");
        quantity3 = scnr.nextDouble();

        subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);

        tax = subtotal * taxRate;

        total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f %n", subtotal);
        System.out.printf("Tax: $%.2f %n", tax);
        System.out.printf("Total: $%.2f %n", total);

        
        System.exit(0);

    } //end of main//


} //end of program//
