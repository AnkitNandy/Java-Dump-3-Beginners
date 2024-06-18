/**1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 1 
 */
public class Pattern3
{
    public static void main()
    {
        int i,j;
        for (i=1;i<=5;i++)
        {
            for (j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}