/** To print the given pattern :- *
 *                                **
 *                                ***    
 *                                ****
 *                                *****
 */
class Pattern10
{
    public static void main()
    {
        int i,j;
        for (i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
