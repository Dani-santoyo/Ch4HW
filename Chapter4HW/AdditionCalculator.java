package Chapter4HW;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: 4/1, 2024
 *
 * AdditionCalculator - prompts the user to enter two integers and adds them.
 * Uses effective exception handling.
 */
public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        boolean flag = true;

        do {
            try {
                System.out.println("Enter two integers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                sum = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
                flag = false;
            } catch (InputMismatchException ex) {

                System.out.println("Error: Input Mismatch Exceptions is occurred");
                input.nextLine();
            }
        } while(flag);
    }
}
