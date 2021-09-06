package Assignment01;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Adrian Chew
 */

import java.util.Scanner;

public class Solution05 {
    /*
    print "What is the first number? "
    'in' = get input from user
    'num1' = parseInt(input)
    print "What is the second number? "
    'in' = get input from user
    'num2' = parseInt(input)
    'sum' = num1 + num2
    'difference' = num1 - num2
    'product' = num1 * num2
    'quotient' = num1 / num2
    print "'num1' + 'num2' = 'sum'\n'num1' - 'num2' = 'difference'\n'num1' * 'num2' = 'product'\n'num1' / 'num2' = 'quotient'"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number? ");
        String in = input.nextLine();
        int num1 = Integer.parseInt(in);

        System.out.println("What is the second number? ");
        in = input.nextLine();
        int num2 = Integer.parseInt(in);

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", num1, num2, sum, num1, num2, difference, num1, num2, product, num1, num2, quotient);
    }
}
