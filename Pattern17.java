/** To print the given pattern :- 1
 *                                11
 *                                112
 *                                1123
 *                                11235
 *                                112358
 */
class Pattern17
{
    public static void main()
    {
        for (int i=1;i<=6;i++)
        {
            for (int j=1;j<=i;j++)
            {
                int a=1,b=0;
                int sum;
                sum=a+b;
                System.out.print(sum);
                a=b;
                b=sum;
            }
            System.out.println();
        }
}
}
