/**WAP to accept a number from the user and
 * check whether it is a 'BUZZ' number or to
 * accept any two numbers and print GCD of them.
 * (a) A BUZZ number is a number which either 
 *     ends with 7 or is divisible by 7.
 * (b) GCD (Greatest Common Divisor) of two
 *     integers is the highest common factor
 *     that divides two given numbers.
 *  The program must be menu-driven.
 */
import java.util.*;
class Practice3
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("(a) BUZZ Number\n(b) Greatest Common Divisor(GCD)");
        System.out.println("Press 'a' or 'b' to perform any of the given tasks.\n");
        System.out.println("Enter your choice :-");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            System.out.println("Buzz Number??\n");
            System.out.println("Enter a number :-");
            int num=sc.nextInt();
            System.out.println();
            if ((num%10)==7 && num%7==0)
            System.out.println(num+" is A BUZZ NUMBER.");
            else
            System.out.println(num+" is NOT A BUZZ NUMBER.");
            System.out.println("THE END!!");
            break;
            case 'b':
            System.out.println("GCD or HCF??\n");
            System.out.println("Enter two numbers :-");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println();
            int p=a*b;
            int i,gcd=0;
            for (i=1;i<=p;i++)
            {
                if (a%i==0 && b%i==0)
                gcd=i;
            }
            System.out.println("The greatest common divisor (GCD) of "+a+" and "+b+" is =\n"+gcd);
            System.out.println("THE END!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!\nTry Again.....");
        }
    }
}