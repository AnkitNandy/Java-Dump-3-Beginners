/*To accept a number and
 * check whether the number
 * is a palindrome number or not.
 * Palindrome:-Number whose if 
 * digits are reversed give the
 * original number.
 */
import java.util.*;
public class Palindrome_Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;//number entered
        int d;
        int rev=0;//reverse
        int num;//=n
        System.out.println("TO CHECK IF A NUMBER ENTERED IS A PALINDROME NUMBER");
        System.out.println("Palindrome Number:-"+"\n"+"A number whose if digits are reversed give the original number.");
        System.out.println();      
        System.out.println("Enter a number:-");
        n=sc.nextInt();
        num=n;
        while (n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if (rev==num)
        System.out.println(num+" is a Palindrome Number.");
        else
        System.out.println(num+" is not a Palindrome Number.");
    }
}