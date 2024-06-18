/**Program that computes payment
 * for a proof-reader who is paid
 * Rs 60/- per page proofread.
 * Input the pages read by the Proofreader in 
 * first,second,third and fourth week.
 * Then add them and multiply by 60.
 */
import java.util.*;
public class ProofReader
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("TO COMPUTE PAYMENT FOR A PROOFREADER WHO IS PAID RS 60 PER PAGE");
        System.out.println("FIRST, TO INPUT THE NUMBER OF PAGES READ BY PROOFREADER IN 4 WEEKS");
        int page1,page2,page3,page4,tpage;
        //tpage is the total number of pages read by the proofreader in four weeks
        System.out.println("Enter no. of pages read in first week:-(not in decimals)");
        page1=sc.nextInt();
        System.out.println("Enter no. of pages read in second week:-");
        page2=sc.nextInt();
        System.out.println("Enter no. of pages read in third week:-");
        page3=sc.nextInt();
        System.out.println("Enter no. of pages read in fourth week:-");
        page4=sc.nextInt();
        tpage=page1+page2+page3+page4;
        int amt;//amount to be paid, which is Rs 60/- per page
        amt=tpage*60;
        System.out.println("For "+tpage+" pages read,");
        System.out.println("the amount payable is @Rs "+amt+"/-.");
    }
}