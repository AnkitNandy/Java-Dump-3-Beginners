/**WAP to print even nos. from 1 to 50
 * using do-while statement.
 */
class PDF_309
{
    static void main()
    {
        int a=1;
        do
        {
            if (a%2==0)
            System.out.println(a);
            a++;
        }while (a<=50);
    }
}