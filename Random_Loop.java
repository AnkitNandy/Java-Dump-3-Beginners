/**Write a program to accept 
 * lower limit and upper limit.
 * Then print 'n' integral random numbers
 * between the limits entered.
 */
import java.util.*;
public class Random_Loop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a;//'n' number of random numbers that are to be printed
        int m,n;//m - lower limit & n - upper limit
        int i;
        int random;//result
        System.out.println("TO GENERATE RANDOM NUMBERS BETWEEN TWO GIVEN NUMBERS");
        System.out.println();
        System.out.println("Enter lower limit:-(must be an integer)");
        m=sc.nextInt();
        System.out.println("Enter upper limit:-(also an integer)");
        n=sc.nextInt();
        System.out.println("Enter how many random numbers you want to print between "+m+" and "+n+":-");
        a=sc.nextInt();
        System.out.println();
        System.out.println(a+" random numbers between "+m+" and "+n+" are:-");
        for (i=1;i<=a;i++)
        {
            random=(int)((Math.random()*(n-m))+m);
            System.out.println(+random);
        }
    }
}