/*Program to find whether a number
 * is perfect square or not.
 */
import java.util.*;
public class PerfectSquare
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        float num;
        System.out.println("TO CHECK WHETHER A NUMBER IS A PERFECT SQUARE OR NOT");
        System.out.println();
        System.out.println("Enter a number:-");
        num=sc.nextFloat();
        double sqrt;
        sqrt=Math.sqrt(num);
        int srt=(int)sqrt;
        if (srt*srt==num)
        System.out.println(num+" is a perfect square.");
        else
        System.out.println(num+" is not a perfect square.");
    }
}
        