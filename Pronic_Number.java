/**WAP to input a number and check and print
 * whether it is a Pronic number or not.
 * (Pronic number is the number which is the product of 
 * two consecutive integers).
 * 
 * Examples:
 * 12 = 3*4
 * 20 = 4*5
 * 42 = 6*7
 */
import java.util.*;
class Pronic_Number
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int a=0,flag=0;
        for (int i=1;i<=num;i++)
        {
            a=i+1;
            if (a*i == num)
            {
                flag=1;
                break;
            }
        }
        if (flag==1)
        System.out.println(num+" is a Pronic Number.");
        else 
        System.out.println(num+" is not a Pronic Number!!");
    }
}