/** To print the given pattern :- *****
 *                                ****
 *                                ***
 *                                **
 *                                *
 */
class Pattern11
{
    public static void main()
    {
        int i,j;
        for (i=1;i<=5;i++)
        {
            for (j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}