/**Define the class Number with a static variable
 * N of integer data type. Initialize the member 
 * variable to 0(zero) using default constructor 
 * and accept the number using the function readNum().
 * Also in readNum()function write a menu driven program
 * for the following:
 * 1) Invoke the function square() to print all the
 *    digits of N which are perfect square. 1 is a square number.
 * 2) Invoke the function prime() to print all the prime
 *    digits of N. 1 is not a prime number.
 */
import java.util.*;
class Num
{
    int N;
    Num()
    {
        N=0;
    }
    public void readNum()
    {
        Scanner sc=new Scanner(System.in);
        Num obj=new Num();
        System.out.println("Enter a number:");
        N=sc.nextInt();
        System.out.println("\nPress '1' to invoke the function square().");
        System.out.println("Press '2' to invoke the function prime().");
        System.out.println("\nEnter your choice:");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            square(N);
            break;
            case 2:
            prime(N);
            break;
            default:
            System.out.println("Wrong Choice Entered!!");
        }
    }
    void square(int num)
    {
        int n=num;
        int d;
        System.out.println("\nDigits of "+num+" which are perfect squares :");
        while (n!=0)
        {
            d=n%10;
            if (Math.sqrt(d)%1==0)
            System.out.println(d);
            n=n/10;
        }
    }
    void prime(int num)
    {
        int n=num;
        int d,cnt=0;
        System.out.println("\nDigits of "+num+" which are prime :");
        while (n!=0)
        {
            cnt=0;
            d=n%10;
            for (int i=1;i<=d;i++)
            {
                if (d%i==0)
                cnt++;
            }
            if (cnt==2)
            {
                System.out.println(d);
            }
            n=n/10;
        }
    }
}
            