/**Write a program to input both
 * first and second limit(integers).
 * Then display the integers between them 
 * and finally add the even and odd numbers
 * seprately among them.
 */
import java.util.*;//package name 
public class OddEvenSum 
{
    public static void main() 
    {
        int m,n,i,sum1=0,sum2=0; 
        Scanner sc =new Scanner(System.in);//creating scanner class
        System.out.println("Enter first limit:-");
        m=sc.nextInt(); 
        System.out.println("Enter second limit:-");
        n=sc.nextInt();
        System.out.println("The numbers from "+m+" and "+n+" are:-");
        for(i=m;i<=n;i++)
        {
            System.out.println(+i);
            if((i%2)==1)
            {
                sum1+= i;
            }
            if((i%2)!=1)
            {
                sum2+=i;
            }
        } 
        System.out.println("THE END!!");
        System.out.println("Sum of all odd numbers between "+m+" to "+n+" = "+sum1);
        System.out.println("Sum of all even numbers between "+m+" to "+n+" = "+sum2);
    }
}
