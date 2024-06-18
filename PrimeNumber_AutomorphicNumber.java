/**Menu-driven program to accept a number and 
 * check and display whether it is a Prime Number 
 * or not or an Automorphic Number or not(Use Switch Case).
 * i) Prime Number: A number is said to be a prime number if
 *                  it is divisible only by one and itself
 *                  and not by any other number.
 * ii) Automorphic Number: It is the number which is contained
 *                         in the last digit(s) of its square.
 *                         Example: 25 is an automorphic number
 *                                  as its square is 625 and 25 is 
 *                                  present as the last two digits.
 */
import java.util.*;
public class PrimeNumber_AutomorphicNumber
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Press '1' to check if a number entered is PRIME OR NOT.");
        System.out.println("Press '2' to check if a number entered is AUTOMORPHIC.");
        System.out.println();
        int num,count=0,i,d,square,s=0;
        System.out.println("Enter your choice :-");
        int choice=scan.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter an integer to see if it is a Prime Number :-");
            num=scan.nextInt();
            System.out.println();
            count=0;
            for (i=1;i<=num;i++)
            {
                if (num%i==0)
                count++;
            }
            if (count==2)
            System.out.println(num+" is A PRIME NUMBER.");
            else
            System.out.println(num+" is NOT A PRIME NUMBER.");
            System.out.println("The End!!");
            break;
            case 2:
            System.out.println("Enter an integer to see if it is an Automorphic Number :-");
            num=scan.nextInt();
            System.out.println();
            square=num*num;   
            int n=num;
            while (n!=0)
            {
                d=n%10;
                count++;
                n=n/10;
            }
            for (i=0;i<count;i++)
            {
                d=square%10;
                s=s+(int)Math.pow(10,i)*d;
                square=square/10;
            }
            if (s==num)
            System.out.println(num+" is AN AUTOMORPHIC NUMBER.");
            else
            System.out.println(num+" is NOT AN AUTOMORPHIC NUMBER.");
            System.out.println("The End!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!!!!\nTry Again.....");
        }
    }
}