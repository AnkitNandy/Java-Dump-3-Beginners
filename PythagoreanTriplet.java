/*Program to input three numbers 
 *and check whether they are 
 *Pythagorean Triplet or not.
 */
import java.util.*;
public class PythagoreanTriplet
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter three numbers:-");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        System.out.println(a+", "+b+" and "+c+" is a Pythagorean Triplet or not???");
        System.out.println("______________________________________________________________________________________________________");
        if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)
        {
            System.out.println(a+", "+b+" and "+c);
            System.out.println("form a Pythagorean Triplet.");
        }
        else
        {
            System.out.println(a+", "+b+" and "+c);
            System.out.println("form a Pythagorean Triplet.");
        }
    }
}