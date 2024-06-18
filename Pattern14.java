/**To print the given pattern :-       5
 *                                    45
 *                                   345
 *                                  2345
 *                                 12345
 * 
 */
class Pattern14
{
    public static void main()
    {
        int i,j;
        int k;
        for (i=5;i>=1;i--)
        {
            for (k=1;k<=i-1;k++)
            {
                System.out.print(" ");
            }
            for (j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}