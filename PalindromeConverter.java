/**A non-palindrome word can be made
 * a palindrome word just by adding 
 * the reverse of the word to the
 * original word. WAP to accept a
 * non-palindrome word and display 
 * the new word after converting it
 * into a palindrome.
 */
import java.util.*;
class PalindromeConverter
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a non-palindrome word :-");
        String s=sc.nextLine();
        s=s.trim();
        System.out.println();
        String str="";
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            str=c+str;
        }
        System.out.println("The new word after making it as palindrome:\n"+s+str);
    }
}