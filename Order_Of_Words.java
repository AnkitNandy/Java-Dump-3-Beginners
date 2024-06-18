/**Create a method which accepts
 * a sentence as parameter and
 * print the words in alphabetical
 * order using Bubble Sorting.
 */
import java.util.*;
class Order_Of_Words
{
    static void main(String s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:\n"+s);
        String str="";
        s=s.trim();
        s=s+" ";
        int cnt=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c==' ')
            cnt++;
        }
        String n[]=new String[cnt];
        int a=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c!=' ')
            str=str+c;
            else
            {
                n[a]=str;
                str="";
                a++;
            }
        }
        String swap="";
        for (int i=n.length-1;i>=0;i--)
        {
            for (int j=0;j<i;j++)
            {
                if (n[j].compareTo(n[j+1])>0)
                {
                    swap=n[j];
                    n[j]=n[j+1];
                    n[j+1]=swap;
                }
            }
        }
        System.out.println("\nAlphabetical order of words:-");
        for (int i=0;i<cnt;i++)
        {
            System.out.println(n[i]);
        }
    }
}