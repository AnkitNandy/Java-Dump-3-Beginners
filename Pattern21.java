/**To print the given pattern:- 12345
 *                               2345
 *                                345
 *                                 45
 *                                  5
 */
class Pattern21
{
    static void main()
    {
        int i,j,k;
        for (i=1;i<=5;i++)
        {
            for (k=2;k<=i;k++)
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