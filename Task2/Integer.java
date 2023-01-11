package Task2;

import java.util.*;
public class Integer {

    public static void main(String[] args) {

        int integer;
        int ogInteger;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000: ");
        integer = input.nextInt();

        ogInteger = integer;
        while (integer > 0) {
            sum += integer % 10;
            integer /= 10;
        }

        System.out.println("The sum of all digits in " + ogInteger + " is " + sum );
    }
}
