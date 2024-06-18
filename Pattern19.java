/** To print the given pattern :-                     1
 *                                                   121
 *                                                  12321
 *                                                 1234321
 *                                                123454321
 *                                               12345654321
 */
public class Pattern19
{
    public static void main()
    {
        for (int i=1;i<=6;i++)
        {
            for (int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            if (i>=2)
            {
               for (int p=i-1;p>=1;p--)
               {
                    System.out.print(p);
               }
            }
            System.out.println();
    }
}
}