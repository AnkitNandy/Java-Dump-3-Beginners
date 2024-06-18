/**To input an integer and check whether it is
 * perfect, abundant or deficient number.
 * If the sum of the factors excluding itself
 * is equal to that number it is perfect,
 * if greater than that number it is abundant and 
 * if less than that number it is deficient number.
 */
import java.util.*;
public class Perfect_Abundant_Or_Deficient_Number
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check if it is perfect, abundant or deficient :-");
        int num=scan.nextInt();
        int i;
        int sum=0;
        for (i=1;i<num;i++)
        {
            if (num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println();
        if (sum==num)
        System.out.println(num+" is a PERFECT number.");
        else if (sum>num)
        System.out.println(num+" is an ABUNDANT number.");
        else
        System.out.println(num+" is a DEFICIENT number.");
    }
}