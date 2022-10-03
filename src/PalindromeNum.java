// Program to find Palindrome Number using For Loop...
import java.util.Scanner;
public class PalindromeNum {
    public static void reverse(String input) {
        String reverse = "";
        int size = input.length();
        for (int i = size - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        if (input.equals(reverse))
            System.out.println(input+" is Palindrome");
        else
            System.out.println(input+" is NOT Palindrome");
    }
    public static void main(String[] args) {
        String input = "";
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        reverse(input);

    }
}