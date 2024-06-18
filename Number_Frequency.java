import java.util.*;
class Number_Frequency
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        long num=sc.nextLong();
        System.out.println("\nDIGIT    FREQUENCY");
        int f=0;
        long n=num;
        for (long i=0;i<=9;i++)
        {
            f=0;
            n=num;
            while (n!=0)
            {
                long d=n%10;
                if (d==i)
                f++;
                n=n/10;
            }
            System.out.println("  "+i+"          "+f);
        }
    }
}