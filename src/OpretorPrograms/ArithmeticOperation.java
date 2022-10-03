//Program to do arithmetic Operations and find max and min.
package OpretorPrograms;
import java.util.Scanner;
public class ArithmeticOperation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: \n");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: \n");
        int b = sc.nextInt();
        System.out.print("Enter Third Number: \n");
        int c = sc.nextInt();
        int d = a+b*c;
        int e = c+a/b;
        int f = a%b+c;
        int g = a*b+c;
        System.out.println(a+"+"+b+"*"+c+" = " +d);
        System.out.println(c+"+"+a+"/"+b+" = " +e);
        System.out.println(a+"%"+b+"+"+c+" = " +f);
        System.out.println(a+"*"+b+"+"+c+" = " +g);

        System.out.println("Based on above Operations...");

        // To find Max number
        if(d>e && d>f && d>g)
            System.out.println(d+" is Maximum");
        else if (e>f && e>g)
            System.out.println(e+" is Maximum");
        else if (f>g)
            System.out.println(f+" is Maximum");
        else
            System.out.println(g+" is Maximum");

        // To find Min Number
        if(d<e && d<f && d<g)
            System.out.println(d+" is Minimum");
        else if (e<f && e<g)
            System.out.println(e+" is Minimum");
        else if (f<g)
            System.out.println(f+" is Minimum");
        else
            System.out.println(g+" is Minimum");
    }
}
