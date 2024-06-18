/** To print the given pattern:- 65432123456
 *                                543212345
 *                                 4321234
 *                                  32123
 *                                   212
 *                                    1
 */
class Pattern20
{
    static void main()
    {
        int i,j,k,p;
        for (i=6;i>=1;i--)
        {
            for (k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for (j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for (p=2;p<=i;p++)
            {
                    System.out.print(p);
            }
            System.out.println();
        }
    }
}