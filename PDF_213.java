/**WAP to calculate the sum of all prime numbers
 * between the range of 1 and 100.
 */
class PDF_213
{
    boolean prime(int a)
    {
        int cnt=0;
        for (int j=1;j<=a;j++)
        {
            if (a%j==0)
            cnt++;
        } 
        if (cnt==2)
        return true;
        else
        return false;
    }
    static void main()
    {
        int sum=0;
        boolean b;
        PDF_213 obj=new PDF_213(); 
        for (int i=1;i<=100;i++)
        {
            b = obj.prime(i);
            if (b)
            sum = sum+i;
            else 
            continue;
        }
        System.out.println("Sum of all prime numbers from 1 to 100\n= "+sum);
    }
}