/**WAP to accept a string and display the number of
 * uppercase characters, number of lowercase characters
 * and the number of digits present in the string.
 */
import java.util.*;
class PDF_236
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.trim();
        int a=0,b=0,c=0;
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (Character.isLetter(ch))
            {
                if (Character.isUpperCase(ch))
                a++;
                else
                b++;
            }
            if (Character.isDigit(ch))
            c++;
        }
        System.out.println("\nNumber of UpperCase Characters = "+a);
        System.out.println("\nNumber of LowerCase Characters = "+b);
        System.out.println("\nNumber of Digits = "+c);
    }
}