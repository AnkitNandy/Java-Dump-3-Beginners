/**WAP to input a string and print out the text 
 * with the uppercase and lowercase letters 
 * reversed, but all other characters should
 * remain the same as before.
 * 
 * Example:
 * INPUT : WelComE TO School
 * OUTPUT : wELcOMe to sCHOOL
 */
import java.util.*;
class PDF_234
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse the uppercase and lowercase characters :");
        String s=sc.nextLine();
        String str="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (Character.isUpperCase(ch))
            str = str + Character.toLowerCase(ch);
            else
            str = str + Character.toUpperCase(ch);
        }
        System.out.println("\nSentence with reverse case technique :\n"+str);
    }
}