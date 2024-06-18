/**WAP to initialize the given data in an array and
 * find the minimum and maximum values along with 
 * the sum of the given elements.
 */
import java.util.*;
class PDF_251
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an array of 5 integers:");
        int num[] = new int[5];
        for (int i=0;i<5;i++)
        num[i] = sc.nextInt();
        int max=0,min=num[0];
        for (int i=0;i<5;i++)
        {
            if (num[i]>max)
            max=num[i];
            if (num[i]<min)
            min=num[i];
        }
        System.out.println("\nMaximum Value : "+max);
        System.out.println("Minimum Value : "+min);
        System.out.println("\nTheir Sum = "+(min+max));
    }
}