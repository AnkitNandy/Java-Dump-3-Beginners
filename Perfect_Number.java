/**To check whether a number
 * is a perfect number or not.
 * Perfect means sum of factors of entered number
 * is equal to that of the original number.
 */
import java.util.Scanner;
public class Perfect_Number
{
    public static void main() 
    {
        int n, sum = 0;
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("PERFECT NUMBER OR NOT??");
        System.out.println("Enter any integer you want to check:-");
        n = s.nextInt();
        for(i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println(n+" is a Perfect Number.");
        }
        else
        {
            System.out.println(n+" is not a Perfect Number.");
        }    
    }
}