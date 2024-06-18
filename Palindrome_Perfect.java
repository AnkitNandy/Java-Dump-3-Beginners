/**Menu-driven program to accept a number from the user
 * and check whether it is a Palindrome or a Perfect Number.
 * i) Palindrome - A number is palindrome which when read in
 *                 the reverse order is same as read in the right order.
 * ii) Perfect - A number is called perfect if it is equal to the sum of
 *               its factors other than the number itself.
 */
import java.util.*;
public class Palindrome_Perfect
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int choice;
        int sum=0,digit,num,n,reverse=0;
        System.out.println("Press '1' to check whether a number is PALINDROME OR NOT.");
        System.out.println("Press '2' to check whether a number is PERFECT OR NOT.");
        System.out.println();
        System.out.println("Enter your choice :-");
        choice=scan.nextInt();
        System.out.println();
        switch(choice)
        {
            case 1:
            System.out.println("Enter an integer to check if it is a Palindrome Number :-");
            num=scan.nextInt();
            System.out.println();
            n=num;
            while (n!=0)
            {
                digit=n%10;
                reverse=reverse*10+digit;
                n=n/10;
            }
            if (reverse==num)
            System.out.println(num+" is A PALINDROME NUMBER.");
            else
            System.out.println(num+" is NOT A PALINDROME NUMBER.");
            System.out.println("The End!!");
            break;
            case 2:
            System.out.println("Enter an integer to check if it is a Perfect Number :-");
            num=scan.nextInt();
            System.out.println();
            for (int i=1;i<num;i++)
            {
                if (num%i==0)
                sum=sum+i;
            }
            if (sum==num)
            System.out.println(num+" is A PERFECT NUMBER.");
            else
            System.out.println(num+" is NOT A PERFECT NUMBER.");
            System.out.println("The End!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!!!!\nTry Again....");
        }
    }
}