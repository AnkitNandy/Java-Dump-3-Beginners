/**Write a program to input the
 * limit till which you want to 
 * print even and odd numbers from 1.
 * It must be done using 'Case Structures'.
 */
import java.util.*;//package name
public class OddEvenLoop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);//creating scanner object
        int lim;//stands for limit
        char c;//stands for choice entered by user 
        int i;
        System.out.println("TO PRINT ODD OR EVEN NUMBERS FROM 1 TO LIMIT");
        System.out.println("Enter the limit till which you want to print numbers from 1:-");
        lim=sc.nextInt();
        System.out.println("Press 'o' for odd numbers from 1 to "+lim);
        System.out.println("Press 'e' for even numbers from 1 to "+lim);
        System.out.println("Enter your choice:-");
        c=sc.next().charAt(0);
        switch(c)
        {
            case 'o':
            System.out.println("The odd numbers from 1 to "+lim+" are:-");
            {
                for (i=1;i<=lim;i+=2)
                {
                    System.out.println(+i);
                }
            }
            break;
            case 'e':
            System.out.println("The even numbers from 1 to "+lim+" are:-");
            {
                for (i=2;i<=lim;i+=2)
                {
                    System.out.println(+i);
                }
            }
            break;
            default:
            System.out.println("Wrong Choice!!"+"\n"+"You must enter either 'o' or 'e'.");
            System.out.println("Do it again.");
        }
        }
    }

              
                    