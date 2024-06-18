/**WAP using a function called area() to
 * compute the area of a :
 * 
 * circle (pie * r square) where pie = 3.14
 * square (side * side)
 * rectangle (length * breadth)
 * 
 * Display the menu to obtain the area as per
 * the user's choice.
 */
import java.util.*;
class PDF_208
{
    double area(double r)
    {
        double ar=3.14*r*r;
        return ar;
    }
    int area(int s)
    {
        int ar=s*s;
        return ar;
    }
    double area(double x,double y)
    {
        double ar=x*y;
        return ar;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to find the area of a circle.");
        System.out.println("Press 2 to find the area of a square.");
        System.out.println("Press 3 to find the area of a rectangle.");
        System.out.println("\nEnter your choice:");
        int choice=sc.nextInt();
        double rad,a,b;
        int side;
        PDF_208 obj = new PDF_208();
        switch(choice)
        {
            case 1:
            System.out.println("\nAREA OF A CIRCLE ??");
            System.out.println("\nEnter the radius of the circle:");
            rad=sc.nextDouble();
            System.out.println("\nArea of the circle = "+obj.area(rad)+" sq.units");
            break;
            case 2:
            System.out.println("\nAREA OF A SQUARE ??");
            System.out.println("\nEnter the length of the side of the square:");
            side=sc.nextInt();
            System.out.println("\nArea of the square = "+obj.area(side)+" sq.units");
            break;
            case 3:
            System.out.println("\nAREA OF A RECTANGLE ??");
            System.out.println("\nEnter the length of the rectangle:");
            a=sc.nextDouble();
            System.out.println("Enter its breadth:");
            b=sc.nextDouble();
            System.out.println("\nArea of the rectangle = "+obj.area(a,b)+" sq.units");
            break;
            default:
            System.out.println("\nWrong Choice Entered!!");
        }
    }
}