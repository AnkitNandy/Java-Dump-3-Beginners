/** To print the given pattern :- 1
 *                                11
 *                                101
 *                                1001
 *                                10001
 *                                100001
 */
class Pattern16
{
    public static void main()
    {
        int i,j;
        System.out.println("1");
        for (i=1;i<=5;i++)
        {
            j=(int)(Math.pow(10,i)+1);
            System.out.print(j);
            System.out.println();
        }
    }
}