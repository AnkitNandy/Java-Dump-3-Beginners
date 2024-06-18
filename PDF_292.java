/**WAP to print the sum of the following series:
 * 1/1! - 2/2! + 3/3! - .............N/N!.
 * Where N is the input.
 */
import java.util.*;
class PDF_292
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of terms in the series:");
        int N=sc.nextInt();
        double s=0.0;
        double fact=1.0;
        for (int i=1;i<=N;i++)
        {
            for (int j=1;j<=i;j++)
            fact=fact*j;
            if (i%2!=0)
            {
                s = s + (i/fact);
            }
            else
            {
                s = s - (i/fact);
            }
            fact=1;
        }
        System.out.println("\nSum of the following series");
        System.out.println("= "+s);
    }
}