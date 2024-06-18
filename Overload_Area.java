import java.util.*;
class Overload_Area
{
    void area(double base,double height)
    {
        System.out.println("\nArea of Parallelogram = "+(height*base));
    }
    void area(int m,int n)
    {
        System.out.println("\nArea of Rhombus = "+((1.0/2.0)*m*n));
    }
    void area(double s1,double s2,double ht)
    {
        System.out.println("\nArea of Trapezium = "+((1.0/2.0)*(s1+s2)*ht));
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Overload_Area obj = new Overload_Area();
        double h;
        System.out.println("Enter base of parallelogram:");
        double b=sc.nextDouble();
        System.out.println("Enter its height:");
        h=sc.nextDouble();
        obj.area(b,h);
        System.out.println("\nEnter the lengths of diagonals of rhombus:");
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        obj.area(d1,d2);
        System.out.println("\nEnter the lengths of parallel sides of trapezium:");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        System.out.println("Enter the perpendicular distance between these parallel sides:");
        h=sc.nextDouble();
        obj.area(x,y,h);
    }
}