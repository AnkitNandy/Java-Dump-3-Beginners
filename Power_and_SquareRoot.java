/**Program that computes the 
 * power and square root of a 
 * number as an input from the user.
 * It is displayed depending upon 
 * the user's choice.
 */
import java.util.*;
public class Power_and_SquareRoot
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        float base,expo,num;
        double sqrt,pow;
        System.out.println("TO COMPUTE THE SQUARE ROOT AND POWER");
        System.out.println();
        System.out.println("1. Power");
        System.out.println("2. Square Root");
        System.out.println("3. Both of them");
        System.out.println("Enter your choice out of 1, 2 and 3:-");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Power???");
            System.out.println();
            System.out.println("Enter base:-");
            base=sc.nextFloat();
            System.out.println("Enter exponent or index:-");
            expo=sc.nextFloat();
            pow=Math.pow(base,expo);
            System.out.println(base+" raised to exponent "+expo+" is-"+"\n"+pow);
            break;
            case 2:
            System.out.println("Square Root???");
            System.out.println();
            System.out.println("Enter the number whose square root you want to calculate:-");
            num=sc.nextFloat();
            sqrt=Math.sqrt(num);
            System.out.println("The square root of "+num+" is-"+"\n"+sqrt);
            break;
            case 3:
            System.out.println("Power and Square Root???");
            System.out.println();
            System.out.println("First, Power");
            System.out.println("Enter base:-");
            base=sc.nextFloat();
            System.out.println("Enter exponent or index:-");
            expo=sc.nextFloat();
            pow=Math.pow(base,expo);
            System.out.println(base+" raised to exponent "+expo+" is-"+"\n"+pow);
            System.out.println();
            System.out.println("Second, Square Root"); 
            System.out.println("Enter the number whose square root you want to calculate:-");
            num=sc.nextFloat();
            sqrt=Math.sqrt(num);
            System.out.println("The square root of "+num+" is-"+"\n"+sqrt);
            break;
            default:
            System.out.println("Wrong Choice Entered!!!");
            System.out.println("You must enter either 1, 2 or 3.");
        }
    }
}