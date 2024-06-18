/**Menu-driven program to find the sum of the following
 * series depending on the user choosing 1 or 2 :
 * 1. S = 1/4 + 1/8 + 1/12 +.....+ upto n terms
 * 2. S = 1/1! - 2/2! + 3/3! +.........+ upto n terms,
 *    where ! stands for factorial of the number and the
 *    factorial value of a number is the product of all 
 *    integers from 1 to that number.
 *    Eg - 5! = 1*2*3*4*5
 */
import java.io.*;
class Practice1
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. S = 1/4 + 1/8 + 1/12 +.....+ upto n terms");
        System.out.println("2. S = 1/1! - 2/2! + 3/3! +.........+ upto n terms");
        System.out.println("Enter your choice by pressing either 1 or 2 for performing either of these tasks :-");
        int c=Integer.parseInt(buf.readLine());
        System.out.println();
        int n,i,j,a,f;
        double sum=0.0;
        switch (c)
        {
            case 1:
            System.out.println("1. S = 1/4 + 1/8 + 1/12 +.....+ upto n terms ??");
            System.out.println("Enter the number of terms :-");
            n=Integer.parseInt(buf.readLine());
            System.out.println();
            for (i=1,a=4;i<=n;i++,a+=4)
            {
                sum=sum+(1.0/a);
            }
            System.out.println("Sum of the given series =\n"+sum);
            break;
            case 2:
            System.out.println("2. S = 1/1! - 2/2! + 3/3! -.........+ upto n terms ??");
            System.out.println("Enter the number of terms :-");
            n=Integer.parseInt(buf.readLine());
            System.out.println();
            f=1;
            for (i=1,j=i;i<=n;i++,j++)
            {
                if (i%2==0)
                {
                    f=f*j;
                    sum=sum-(double)i/f;
                }
                else
                {
                    f=f*j;
                    sum=sum+(double)i/f;
                }
            }
            System.out.println("Sum of the given series =\n"+sum);
            break;
            default:
            System.out.println("Wrong Choice Entered !!\nTry Again...");
        }
        System.out.println("THE END!!");
    }
}
                