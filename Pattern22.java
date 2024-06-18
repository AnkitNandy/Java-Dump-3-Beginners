/**To print the given pattern:- 99999
 *                               7777
 *                                555
 *                                 33
 *                                  1
 */
class Pattern22
{
    static void main()
    {
        int i,j,k,a=0;
        for (i=9;i>=1;i-=2)
        {
            for (k=0;k<a;k++)
            {
                System.out.print(" ");
            }
            a++;
            for (j=i;j>=1;j-=2)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}