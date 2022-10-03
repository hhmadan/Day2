//Program to reverse the integer number using WHILE loop

import java.util.Scanner;
public class ReverseInteger {
    static int reverseDigits(int num){
        int reverse = 0;
            while(num > 0){
                reverse = reverse * 10 + num % 10;  // getting last digit
                num = num / 10;   // removing last digit
            }
            return reverse;
        }
        public static void main (String[] args)
        {
            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Reverse of "+num+" is: "+ reverseDigits(num));
        }
}
