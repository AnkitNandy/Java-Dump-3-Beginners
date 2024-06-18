/*Program to input two numbers;
 * Then to display both the 
 * quotient and remainder
 * by Division.
 */
import java.util.*;
public class QuotientAndRemainder
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("TO FIND THE QUOTIENT AND REMAINDER AFTER DIVISION");
        System.out.println("Enter two numbers:-");
        a=sc.nextInt();
        b=sc.nextInt();
        double q,r;
        q=a/b;
        r=a%b;
        System.out.println("Quotient is "+q);
        System.out.println("Remainder is "+r);
    }
}