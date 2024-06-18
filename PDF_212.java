/**WAP to compute and display the sum of given series:
 * 1+2 + 1+2+3 + ......... + 1+2+3+4+.....+n
 * ___   _____               _______________
 * 
 * 1*2 + 1*2*3 +.......... + 1*2*3*4*.....*n
 */
import java.util.*;
class PDF_212
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Given series :");
        System.out.println("1+2 + 1+2+3 + ......... + 1+2+3+4+.....+n");
        System.out.println("");
        System.out.println("___   _____               _______________");
        System.out.println("");
        System.out.println("1*2 + 1*2*3 +.......... + 1*2*3*4*.....*n");
        System.out.println("\nEnter the value of 'n' for the series:");
        int n=sc.nextInt();
        if (n<2)
        {
            System.out.println("Value of n must be more than 1.\nTry Again!!");
            System.exit(0);
        }
        double a=0.0,b=0.0;
        int c=1;
        for (int i=2;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                a = (double)(a+j)/(c*j);
            }
            b = b+a;
 
            a = 0.0;
        }
        System.out.println("\nSum of the following series = "+b);
    }
}