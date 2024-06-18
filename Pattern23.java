/**To display the given pattern :-         1
 *                                        33
 *                                       555
 *                                      7777
 *                                     99999
 */
class Pattern23
{
    static void main()
    {
        int i,j,k;
        for (i=1;i<=9;i+=2)
        {
            for (k=9;k>=i;k=k-2)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j+=2)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}