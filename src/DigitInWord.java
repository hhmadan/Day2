// Program to Read Single Digit No and Write in Word using else-if

import java.util.Scanner;
public class DigitInWord {
        public static void main(String[] args) {
            System.out.println("Enter a Single Digit Number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            //System.out.println("Number is: " + n);
            if (n == 0) {
                System.out.println("Number is Zero ");
            } else if (n == 1) {
                System.out.println("Number is One ");
            } else if (n == 2) {
                System.out.println("Number is Two ");
            } else if (n == 3) {
                System.out.println("Number is Three ");
            } else if (n == 4) {
                System.out.println("Number is Four ");
            } else if (n == 5) {
                System.out.println("Number is Five ");
            } else if (n == 6) {
                System.out.println("Number is Six ");
            } else if (n == 7) {
                System.out.println("Number is Seven ");
            } else if (n == 8) {
                System.out.println("Number is Eight ");
            } else if (n == 9) {
                System.out.println("Number is Nine ");
            } else {
            System.out.println("Please enter Single Digit..!");
            }
        }}
