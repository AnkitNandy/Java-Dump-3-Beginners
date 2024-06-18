/**WAP to input a string in uppercase and print the
 * frequency of each character.
 * 
 * Example:
 * INPUT : COMPUTER HARDWARE
 * OUTPUT : CHARACTERS          FREQUENCY
 *               A                  2
 *               C                  1
 *               D                  1
 *               E                  2
 *               H                  1
 *               M                  1
 *               O                  1
 *               P                  1
 *               R                  3
 *               T                  1
 *               U                  1
 *               W                  1
 */
import java.util.*;
class PDF_233
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.toUpperCase();
        System.out.println();
        int cnt=0;
        System.out.println("/nCHARACTERS          FREQUENCY");
        for (char ch='A';ch<='Z';ch++)
        {
            for (int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if (c==ch)
                {
                    cnt++;
                }
            }
            if (cnt!=0)
            System.out.println("    "+ch+"                     "+cnt);
            cnt=0;
        }
    }
}