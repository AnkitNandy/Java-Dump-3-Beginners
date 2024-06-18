/** 15 14 13 12 11
 *  10 9  8  7
 *  6  5  4
 *  3  2
 *  1
 */
class Pattern25
{
    static void main()
    {
        int a=15;
        for (int i=5;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
}