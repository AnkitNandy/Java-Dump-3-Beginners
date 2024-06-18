//To input a number and check whether it is prime or not.(A prime number has only two factors)
import java.util.*;
public class Prime_Or_Not
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check whether it is a prime number :-");
        int num=scan.nextInt();
        System.out.println();
        int c=0;
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            c++;
        }
        if (c==2)
        System.out.println(num+" is A PRIME NUMBER.");
        else
        System.out.println(num+" is NOT A PRIME NUMBER.");
    }
}