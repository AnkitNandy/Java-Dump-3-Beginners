import java.util.*;
public class Overload
{
    double volume(double r)
    {
        double v1=(1.0/3.0)*(22.0/7.0)*r*r*r;
        return v1;
    }
    double volume(double r,double h)
    {
        double v2=(1.0/3.0)*(22.0/7.0)*r*r*h;
        return v2;
    }
    double volume(double l,double b,double h)
    {
        double v3=l*b*h;
        return v3;
    }
    public static void main()
    {
        Overload obj=new Overload();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of sphere:");
        double r=sc.nextDouble();
        System.out.println("The volume of the sphere is "+obj.volume(r));
        System.out.println("\nEnter the radius and the height of cone:");
        r=sc.nextDouble();
        double h=sc.nextDouble();
        System.out.println("The volume of the cone is "+obj.volume(r,h));
        System.out.println("\nEnter the length, breadth and the height of cuboid:");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        h=sc.nextDouble();
        System.out.println("The volume of the cuboid is "+obj.volume(l,b,h));
    }
}        