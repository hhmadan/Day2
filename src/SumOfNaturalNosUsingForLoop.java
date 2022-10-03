import java.util.Scanner;
public class SumOfNaturalNosUsingForLoop {
    public static void main(String[] args) {

        int n, sum = 0;
        System.out.println("Enter the Natural Number: ");
        Scanner scan = new Scanner(System.in);
            n = scan.nextInt();

        for (int i=0; i <= n; i++)
        {
            sum = sum+i;
        }

        System.out.println("Sum of first "+n+" Natural Numbers is "+sum);

    }

}
