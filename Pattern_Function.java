/**Design a class to overload a function pattern() as follows: 
i) void pattern(char ch, int n) with one character and one integer
 argument and prints 'n' lines containing the character stored in 'ch'
 in the following pattern, If ch = @ and n = 3, then output: 		
                      @ 
		             @ @ 
	                @ @ @ 
ii) double pattern(double x, double n) with two double 
arguments and returns the sum of the series, 
     n   n-1 n-2         2   1
S = x + x + x  + ……. + x + x + 1
*/
import java.util.*;
class Pattern_Function
{
    void pattern(char ch, int n, double x)
    {
        System.out.println("Required Pattern:");
        for (int i=1;i<=n;i++)
        {
            for (int k=n+1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        double s=0;
        for (int i=n;i>=1;i--)
        {
            s=s+(Math.pow(x,i));
        }
        System.out.println("\nSum of the given series:\n"+s);  
    }
}