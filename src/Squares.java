/*
Pseudocode:
import scanner
declare class
declare method
prompt user to input number
initialize input variable using scanner
define for loop
print squares
 */

import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        int number;
        int square;
        Scanner input;

        System.out.println("Enter a number: ");
        input = new Scanner(System.in);
        number = input.nextInt();

        System.out.println("Number \t Square");
        System.out.println("----------------");

        for (int i = 1; i <= number; i ++) {
            square = i * i;
            System.out.printf("%d \t\t %d \n", i, square);
        }
    }
}
