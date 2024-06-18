//To input an integer and count the number of its factors.
import java.util.*;
public class Number_Of_Factors
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to count its factors :-");
        int num=scan.nextInt();
        System.out.println();
        int count=0;
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            count++;
        }
        System.out.println(num+" has "+count+" factors.");
    }
}