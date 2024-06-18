/**WAP to print the sum of negative numbers, sum of positive
 * even numbers and sum of positive odd numbers from a list 
 * of numbers(N) entered by the user. The list terminates
 * when the user enters a zero.
 */
import java.util.*;
class PDF_216
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int spe=0,sn=0,spo=0;
        System.out.println("Enter a list of numbers (You can finish the list by pressing zero '0'):");
        int N=sc.nextInt();
        if (N>0 && N%2==0)
        spe = spe+N;
        if (N>0 && N%2!=0)
        spo = spo+N;
        if (N<0)
        sn = sn+N;
        while (N!=0)
        {
            N=sc.nextInt();
            if (N>0 && N%2==0)
            spe = spe+N;
            if (N>0 && N%2!=0)
            spo = spo+N;
            if (N<0)
            sn = sn+N;
        }
        System.out.println("\nSum of Negative Numbers = "+sn);
        System.out.println("\nSum of Positive Odd Numbers = "+spo);
        System.out.println("\nSum of Positive Even Numbers = "+spe);
    }
}