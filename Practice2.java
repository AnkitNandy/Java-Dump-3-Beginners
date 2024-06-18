/**Menu-driven program to accept a number and check and display whether
 * it is a prime number or not, or an automorphic number or not.
 * (a) Prime Number: A number is said to be a prime number if it is
 *                   divisible only by 1 and itself and not by any 
 *                   other number.
 *                   Example:- 3, 5, 7, 11, 13, etc.
 * (b) Automorphic Number: An automorphic number is the number which 
 *                         is contained in the last digit(s)
 *                         of its square.
 *                         Example:- 25 is an automorphic number as
 *                         its square is 625 and 25 is present as the
 *                         last two digits.
 */
import java.io.*;
class Practice2
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 1 to check if a number is Prime or not.");
        System.out.println("Press 2 to check if a number is Automorphic or not.\n");
        System.out.println("Enter your choice :-");
        int c=Integer.parseInt(buf.readLine());
        System.out.println();
        int n,i,cnt,sq,d,sum=0;
        switch(c)
        {
            case 1:
            System.out.println("PRIME OR NOT ??");
            System.out.println("Enter a number (integer) :-");
            n=Integer.parseInt(buf.readLine());
            System.out.println();
            cnt=0;
            for (i=1;i<=n;i++)
            {
                if (n%i==0)
                cnt++;
            }
            if (cnt==2)
            System.out.println(n+" is a PRIME NUMBER.");
            else
            System.out.println(n+" is NOT A PRIME NUMBER.");
            break;
            case 2:
            System.out.println("AUTOMORPHIC OR NOT ??");
            System.out.println("Enter a number (integer) :-");
            n=Integer.parseInt(buf.readLine());
            System.out.println();
            sq=n*n;   
            int num=n;
            cnt=0;
            while (num!=0)
            {
                d=num%10;
                cnt++;
                num=num/10;
            }
            for (i=0;i<cnt;i++)
            {
                d=sq%10;
                sum=sum+(int)Math.pow(10,i)*d;
                sq=sq/10;
            }
            if (sum==n)
            System.out.println(n+" is AN AUTOMORPHIC NUMBER.");
            else
            System.out.println(n+" is NOT AN AUTOMORPHIC NUMBER.");
            break;
            default:
            System.out.println("Wrong Choice Entered!!\nTry Again.....");
        }
        System.out.println("THE END!!");
    }
}