//To check and display whether a number entered is composite or not
import java.util.*;
public class PrimeOrComposite
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number to check if it is prime or composite:-");
        n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++)
        {
            if (i%2==0)
            count++;
        }
        if (count>1)
        System.out.println(n+" is a COMPOSITE NUMBER.");
        else
        System.out.println(n+" is NOT A COMPOSITE NUMBER.");
    }
}
