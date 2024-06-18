/** To print the given pattern :- 1
 *                                01
 *                                101
 *                                0101
 *                                10101
 */
class Pattern12
{
    public static void main()
    {
        int i,j;
        int a=0,b=1;
        for (i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                if (j%2==0)
                System.out.print(a);
                else
                System.out.print(b);
            }
            System.out.println();
        }
    }
}