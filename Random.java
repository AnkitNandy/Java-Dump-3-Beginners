import java.util.*;
public class Random
{
    public static void main()
    {
        int i;
        double d;
        System.out.println("The Random numbers between 0 and 1 are:-");
        for (i=1;i<=10;i++)
        {
            d=Math.random();
            System.out.println(+d);
        }
    }
}