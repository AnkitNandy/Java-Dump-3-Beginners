/**WAP to generate a triangle or an inverted triangle
 * till n terms based upon the user's choice of
 * triangle to be displayed.
 * EXAMPLE 1:-
 * Output: (when n = 5)
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * 
 * EXAMPLE 2:-
 * Output: (when n = 6)
 * 6 6 6 6 6 6
 * 5 5 5 5 5
 * 4 4 4 4 
 * 3 3 3
 * 2 2
 * 1
 */
import java.util.*;
class PDF_209
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to generate a triangle.");
        System.out.println("Press 2 to generate an inverted triangle.");
        System.out.println("\nEnter your choice:");
        int choice=sc.nextInt();
        int i,j,n;
        switch(choice)
        {
            case 1:
            System.out.println("\nEnter the number of terms for the pattern:");
            n=sc.nextInt();
            System.out.println("\nPATTERN FOR TRIANGLE HAVING "+n+" TERMS :\n");
            for (i=1;i<=n;i++)
            {
                for (j=1;j<=i;j++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            System.out.println("\nTHE END !!");
            break;
            case 2:
            System.out.println("\nEnter the number of terms for the pattern:");
            n=sc.nextInt();
            System.out.println("\nPATTERN FOR INVERTED TRIANGLE HAVING "+n+" TERMS :\n");
            for (i=n;i>=1;i--)
            {
                for (j=i;j>=1;j--)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            System.out.println("\nTHE END !!");
            break;
            default:
            System.out.println("\nWrong Choice Entered !!");
        }
    }
}