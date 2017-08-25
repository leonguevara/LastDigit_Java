/*
 *  Main.java
 *  LastDigit_Java
 *
 *  This program will give you the name of the las digit of the addition of any two given numbers
 *
 *  Java:   SDK 1.8 - Language level 8
 *
 *  Author: León Felipe Guevara Chávez
 *  email:  leon.guevara@itesm.mx
 *  date:   May 31st, 2017
 */
package com.leonguevara;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        //  We ask for and read two whole numbers
        System.out.print("Give me the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Give me the second number: ");
        int number2 = scanner.nextInt();

        //  We compute the addition of both numbers and the last digit of such addition
        int addition = number1 + number2;
        short remainder = (short)(addition % 10);

        //  We display the name of the last digit
        switch(remainder) {
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            case 3: System.out.println("three"); break;
            case 4: System.out.println("four"); break;
            case 5: System.out.println("five"); break;
            case 6: System.out.println("six"); break;
            case 7: System.out.println("seven"); break;
            case 8: System.out.println("eight"); break;
            case 9: System.out.println("nine"); break;
            default:
                System.out.println("zero");
        }
    }
}
