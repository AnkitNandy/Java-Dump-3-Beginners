/**WAP to accept a number and check whether the number is
 * Armstrong or not. A number is said to be Armstrong, if
 * the sum of the cubes of its digits is equal to the
 * original number.
 * Example : 
 * INPUT - 153 [1 cube + 5 cube + 3 cube = 153]
 * OUTPUT - Armstrong Number
 */
import java.util.*;
class PDF_214
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int n=num,sum=0;
        while (n!=0)
        {
            int d=n%10;
            sum = sum+(d*d*d);
            n = n/10;
        }
        if (sum==num)
        System.out.println("\n"+num+" IS AN ARMSTRONG NUMBER.");
        else
        System.out.println("\n"+num+" is NOT an Armstrong Number !!");
    }
}