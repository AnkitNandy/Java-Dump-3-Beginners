/**WAP to find the sum of the following series :
 * 
 * S = 1 - (1/2) + (1/3) - (1/4) + (1/5) -.......-(1/10)
 */
class PDF_211
{
    static void main()
    {
        System.out.println("Series:");
        System.out.println("1 - (1/2) + (1/3) - (1/4) + (1/5) -.......-(1/10)");
        double sum=0.0;
        for (int i=1;i<=10;i++)
        {
            if (i%2!=0)
            sum = sum+(1.0/i);
            else
            sum = sum-(1.0/i);
        }
        System.out.println("\nSum of the following series = "+sum);
    }
}