/**Store 20 numbers in single dimensional array
 * and display only those numbers which are prime.
 */
import java.util.*;
class Prime_Array
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[20];
        System.out.println("Enter 20 numbers:-");
        for (int i=0;i<20;i++)
        System.out.println("\nNUMBERS WHICH ARE PRIME:");
        for (int i=0;i<20;i++)
        {
            int cnt=0;
            for (int j=1;j<=num[i];j++)
            {
                if (num[i]%j==0)
                cnt++;
            }
            if (cnt==2)
            System.out.println(num[i]);
        }
    }
}