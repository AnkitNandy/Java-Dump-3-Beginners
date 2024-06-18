/** To print the given patern :- 12345
 *                               2345
 *                               345
 *                               45
 *                               5
 */
class Pattern13
{
    public static void main()
    {
        int i,j;
        for (i=1;i<=5;i++)
        {
            for (j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}