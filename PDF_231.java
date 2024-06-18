/**WAP to accept a sentence and print only the 
 * first letter of each word of the sentence in
 * capital letters separated by a full stop.
 * 
 * Example:
 * INPUT : This is a cat
 * OUTPUT : T.I.A.C
 */
import java.util.*;
class PDF_231
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to convert it into initials :");
        String s=sc.nextLine();
        String str="";
        s=s.trim();
        s=" "+s;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch==' ')
            {
                str = str+(Character.toUpperCase(s.charAt(i+1))) + ".";
            }
        }
        System.out.println("\nRequired output showing initials of the sentence :");
        System.out.println(str);
    }
}