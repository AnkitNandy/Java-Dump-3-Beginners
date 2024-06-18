/**To print the first 15 numbers
 * of the Pell Series.
 * Pell Series is such a series 
 * which starts from 1 and 2, and
 * subsequent numbers are the sum of 
 * twice the previous number and the number 
 * previous to the previous number.
 * Example :- 1,2,5,12,29,70,169,408,
 *            985,2378,5741,13860,.... .
 */
public class Pell_Series
{
    public static void main()
    {
        int a=1,b=2;
        int sum=0;
        System.out.println("First 15 terms of the Pell Series :-");
        System.out.print(a+", "+b+", ");
        for (int i=1;i<=13;i++)
        {
            sum=a+(b*2);
            a=b;
            b=sum;
            if (i==13)
            System.out.print(sum+".");
            else
            System.out.print(sum+", ");
        }
    }
}
            