/**WAP to input a sentence and print the number of
 * characters found in the longest word of the
 * given sentence.
 * 
 * For example:
 * if S = "India is my country",
 * then the output should be 7.
 */
import java.util.*;
class PDF_232
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        String str="";
        int max=0;
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch!=' ')
            {
                str=str+ch;
            }
            else
            {
                if (str.length()>max)
                {
                    max=str.length();
                }
                str="";
            }
        }
        System.out.println("\nNumber of characters present in the longest word");
        System.out.println("= "+max);
    }
}