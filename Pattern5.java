/**5 4 3 2 1
 * 4 3 2 1
 * 3 2 1 
 * 2 1
 * 1
 */
public class Pattern5
{
    public static void main()
    {
        int i,j;
        for (i=5;i>=1;i--)
        {
            for (j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}