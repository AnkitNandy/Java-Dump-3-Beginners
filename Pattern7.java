/**5 5 5 5 5
 * 4 4 4 4
 * 3 3 3
 * 2 2
 * 1
 */
public class Pattern7
{
    public static void main()
    {
        int i,j;
        for (i=5;i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}