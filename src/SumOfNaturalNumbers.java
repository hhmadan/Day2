//Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5 using WHILE Loop

import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        System.out.println("Enter Number to calculate Sum: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(i<=num){
            sum += i;
            i++;
        }
        System.out.println("Sum till entered Number is: "+sum);

    }
}
