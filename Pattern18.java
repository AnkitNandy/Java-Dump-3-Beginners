/** To print the given pattern :- 12345
 *                                 2345
 *                                  345
 *                                   45
 *                                    5
 */
class Pattern18
{
    public static void main()
    {
        int i,j,k;
        for (i=1;i<=5;i++)
        {
            for (k=1;k<=i;k++)
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