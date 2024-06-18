/**Menu-driven class to accept a number from the user and
 * check whether it is Palindrome or a Perfect Number.
 * (a) Palindrome Number - a number is a Palindrome which
 *                         when read in reverse order is 
 *                         same as read in the right order.
 *                         Example: 11, 101, 151, etc..
 * (b) Perfect Number - a number is called Perfect if it is 
 *                      equal to the sum of its factors
 *                      other than the number itself.
 *                      Example: 6 = 1+2+3
 */
import java.util.*;
class Practice4
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("(a) Palindrome Number\n(b) Perfect Number");
        System.out.println("Press 'a' or 'b' to perform any of the above given tasks.\n");
        System.out.println("Enter your choice :-");
        char c=sc.next().charAt(0);
        int num;
        switch(c)
        {
            case 'a':
            System.out.println("PALINDROME OR NOT ??\n");
            System.out.println("Enter a number :-");
            num=sc.nextInt();
            System.out.println();
            int n=num,d,rev=0;
            while (n!=0)
            {
                d=n%10;
                rev=rev*10+d;
                n=n/10;
            }
            if (rev==num)
            System.out.println(num+" is A PALINDROME NUMBER.");
            else
            System.out.println(num+" is NOT A PALINDROME NUMBER.");
            System.out.println("THE END!!!!");
            break;
            case 'b':
            System.out.println("PERFECT OR NOT ??\n");
            System.out.println("Enter a number :-");
            num=sc.nextInt();
            System.out.println();
            int i,sum=0;
            for (i=1;i<num;i++)
            {
                if (num%i==0)
                sum=sum+i;
            }
            if (sum==num)
            System.out.println(num+" is A PERFECT NUMBER.");
            else
            System.out.println(num+" is NOT A PERFECT NUMBER.");
            System.out.println("THE END!!!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!\nTry Again......");
        }
    }
}