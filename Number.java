/**Define the class Number with a static variable N of
 * integer type. Initialize the member variable to 0 
 * (zero) using default constructor and accept the number 
 * using the function readNum(). Also in readNum() function,
 * write a menu driven program for the following:
 * 
 * 1) Invoke the function square() to print all the digits
 *    of N which are perfect square. 1 is a square number.
 * 2) Invoke the function prime() to print all the prime 
 *    digits of N. 1 is not a prime number.
 */
import java.util.*;
class Number
{
    static int N;
    static int d;
    Number()
    {
        N = 0;
    }
    void square()
    {
        System.out.println("\nDigits of "+N+" which are perfect squares:");
        while (N!=0)
        {
            d = N%10;
            if ((Math.sqrt(d))%1 == 0)
            System.out.print(d+", ");
            N = N/10;
        }
    }
    void prime()
    {
        int cnt=0;
        System.out.println("\nPrime Digits of number "+N+" are:");
        while (N!=0)
        {
            cnt=0;
            d = N%10;
            for (int i=1;i<=d;i++)
            {
                if (d%i == 0)
                cnt++;
            }
            if (cnt==2)
            System.out.print(d+", ");
            N = N/10;
        }
    }
    void readNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of variable N:");
        N = sc.nextInt();
        System.out.println("\nPress '1' to invoke the square() function.");
        System.out.println("Press '2' to invoke the prime() function.");
        System.out.println("\nEnter your choice:");
        int ch = sc.nextInt();
        //Number obj = new Number();
        switch(ch)
        {
            case 1:
            square();
            break;
            case 2:
            prime();
            break;
            default:
            System.out.println("Wrong Choice Entered!!");
        }
    }
}