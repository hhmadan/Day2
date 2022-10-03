import java.util.Scanner;
public class ReverseIntForLoop {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int num, reverse = 0;
            System.out.println("Enter a Number: ");
            num = sc.nextInt();
            for( ;num != 0; num=num/10)
            {
                int rem = num % 10;
                reverse = reverse * 10 + rem;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
    }