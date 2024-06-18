/** To print the given pattern :- 1
 *                                21
 *                                321
 *                                4321
 *                                54321
 *                                654321
 */
class Pattern15
{
    static void main()
    {
        int i,j;
        for (i=1;i<=6;i++)
        {
            for (j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}