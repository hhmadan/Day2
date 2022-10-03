package OpretorPrograms;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date: ");
        int date = sc.nextInt();
        System.out.println("Enter Month: ");
        int month = sc.nextInt();

        if (month>3 && month<6  &&  date<=31 && date>=1) // to check April and May
            System.out.println("True");
        else if(month == 3 && date>20 && date<=31)       // to check 20 to 31st March
            System.out.println("True");
        else if(month == 6 && date <= 20 && date >= 1)   // to check 1 to 20 June
            System.out.println("True");
        else
            System.out.println("False");
    }
}
