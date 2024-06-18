/**WAP to input twenty names in an array and display
 * the names whose first alphabet matches with the
 * alphabet entered by the user.
 * 
 * Example:
 * INPUT : Sam
 *         Judy
 *         Suzy
 *         Chris
 *         .......etc.
 * Enter the alphabet : S
 * OUTPUT : Sam
 *          Suzy
 *          .....  .
 */
import java.util.*;
class PDF_235
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[20];
        System.out.println("Enter the names of 20(twenty) people :");
        for (int i=0;i<name.length;i++)
        {
            name[i]=sc.next();
            name[i] = name[i].trim();
        }
        System.out.println("\nEnter an alphabet :");
        char ch=sc.next().charAt(0);
        char c1=Character.toUpperCase(ch);
        char c2=Character.toLowerCase(ch);
        System.out.println("\nNames of people whose name starts with "+ch+" :");
        for (int i=0;i<name.length;i++)
        {
            char a = name[i].charAt(0);
            if (a == c1 || a == c2)
            System.out.println(name[i]);
        }
    }
}