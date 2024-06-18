/**WAP to calculate and print the sum of each of 
 * the following series:
 * (a) Sum(S) = 2 - 4 + 6 - 8 +............-20
 * (b) Sum(S) = (x/2) + (x/5) + (x/8) + (x/11) +...........+(x/20)
 * Value of x is to be input by the user.
 */
import java.util.*;
class PDF_210
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        double S1=0.0;
        for (i=2,j=1;i<=20;i+=2,j++)
        {
            if (j%2!=0)
            S1 = S1+i;
            else
            S1 = S1-i;
        }
        System.out.println("First Series : \n 2-4+6-8+......-20");
        System.out.println("\nSum of the first series = "+S1);
        System.out.println("\nSecond Series : \n (x/2) + (x/5) + (x/8) + (x/11) +...........+(x/20)");
        System.out.println("\nEnter the value of x for the second series:");
        int x=sc.nextInt();
        double S2=0.0;
        for (i=2;i<=20;i+=3)
        {
            S2 = S2+(double)(x/i);
        }
        System.out.println("\nSum of the second series = "+S2);
    }
}