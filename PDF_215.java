/**WAP to calculate and print the sum of odd numbers
 * and the sum of even numbers for the first n
 * natural numbers. The integer n is to be entered
 * by the user.
 */
import java.util.*;
class PDF_215
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the end limit 'n' starting from 1 :");
        int n=sc.nextInt();
        int so=0,se=0;
        for (int i=1;i<=n;i++)
        {
            if (i%2==0)
            se = se+i;
            else
            so = so+i;
        }
        System.out.println("\nSum of odd numbers for the first "+n+" natural numbers = "+so);
        System.out.println("\nSum of even numbers for the first "+n+" natural numbers = "+se);
    }
}