/**5
 * 4 4
 * 3 3 3
 * 2 2 2 2
 * 1 1 1 1 1 
 */
public class Pattern9
{
    public static void  main()
    {
        int i,j;
        for (i=5;i>=1;i--)
        {
            for (j=5;j>=i;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}