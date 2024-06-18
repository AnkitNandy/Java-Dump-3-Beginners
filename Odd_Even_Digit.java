/*To accept a number from user
 * and print both its 
 * odd and even digits.
 */
import java.util.*;
public class Odd_Even_Digit
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,d;//n is number entered
        System.out.println("Enter a number:-");
        n=sc.nextInt();
        int num;//=n
        num=n;
        while (n>0)
        {
            d=n%10;
            if (d%2!=0)
            System.out.println("Odd digits of "+num+":-"+"\n"+d);
            else
            System.out.println("Even digits of "+num+":-"+"\n"+d);
            n=n/10;
        }
        System.out.println();
        System.out.println("THE END");
    }
}
        