//To print the prime factors of a number entered by the user
class PrimeFactors
{
    static void main(int num)
    {
        int i,j,a=0;
        System.out.println("Prime factors of "+num+" =");
        for (i=1;i<=num;i++)
        {
            if (num%i==0)
            {
                for (j=1;j<=i;j++)
                {
                    if (i%j==0)
                    a++;
                }
                if (a<=2)
                System.out.println(i);
            }
            a=0;
        }
    }
}