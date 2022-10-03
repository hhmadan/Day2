// Read 1,10,100,1000 and display unit, ten hundred

import java.util.*;
public class PlaceValue {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1)
            System.out.println("Unit");
        else if(num == 10)
                System.out.println("Ten");
        else if(num == 100)
            System.out.println("Hundred");
        else if(num == 1000)
                System.out.println("Thousand");
        else
            System.out.println("Please enter valid number..!");
    }
}
