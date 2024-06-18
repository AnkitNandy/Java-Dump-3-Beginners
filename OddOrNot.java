/*Program that receives a number and return 
 * true if the passed number is odd
 * otherwise returns false.
 */
import java.util.*;
public class OddOrNot
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("TO FIND WHETHER A NUMBER IS ODD OR NOT");
        System.out.println();
        System.out.println("Enter an integral number:-");
        num=sc.nextInt();
        System.out.println("ODD - true");
        System.out.println("EVEN - false");
        System.out.println();
        boolean test;
        if (num%2==0)
        test=false;
        else
        test=true;
        System.out.println(test);
    }
}