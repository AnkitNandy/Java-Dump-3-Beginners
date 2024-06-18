/**Enter a string and display
 * all the palindrome words
 * present in the string.
 */
import java.util.*;
class Palindrome_Words
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        char c;
        s=s.trim();
        s=s+" ";
        String str="";
        System.out.println("Palindrome Words =\n");
        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if (c!=' ')
            {
                str=str+c;
            }
            else
            {
                char s1=str.charAt(0);
                char s2=str.charAt(str.length()-1);
                if (s1==s2)
                System.out.println(str);
                str="";
            }
        }
    }
}