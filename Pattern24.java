import java.util.*;
class Pattern24
{
    void polygon(int n,char ch)
    {
        System.out.println("\nThe first pattern is:");
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void polygon(int x,int y)
    {
        System.out.println("\nThe second pattern is:");
        for (int i=1;i<=x;i++)
        {
            for (int j=1;j<=y;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    void polygon()
    {
        System.out.println("\nThe third patern is:");
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Pattern24 obj = new Pattern24();
        System.out.println("Enter square side for first pattern:");
        int side=sc.nextInt();
        System.out.println("Enter the character which will draw the square:");
        char m=sc.next().charAt(0);
        obj.polygon(side,m);
        System.out.println("\nEnter length & breadth of rectangle line by line for second pattern:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.polygon(a,b);
        obj.polygon();
    }
}