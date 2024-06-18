/**To accept the cost and selling price of an article
 * and calculate profit or loss percent
 */
import java.util.*;
public class ProfitandLoss
{
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    int cp,sp;
    double profit,loss,pp,lp;
    System.out.println("Enter cost price of article:-");
    cp=sc.nextInt();
    System.out.println("Enter selling price of article:-");
    sp=sc.nextInt();
    if (sp>cp)
    {
        System.out.println("It is a profit!");
        profit=sp-cp;
        System.out.println("The profit is Rs "+profit);
        pp=(profit/cp)*100.0;
        System.out.println("The profit percent is "+pp+"%");
    }
    else if (cp>sp)
    {
        System.out.println("It is a loss!");
        loss=cp-sp;
        System.out.println("the loss is Rs "+loss);
        lp=(loss/cp)*100.0;
        System.out.println("The loss percent is "+lp+"%");
    }
    else
    System.out.println("It is neither a profit nor a loss.");
}
}
    