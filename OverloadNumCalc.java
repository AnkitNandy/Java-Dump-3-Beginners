import java.util.*;
class OverloadNumCalc
{
    void num_calc(int num,char ch)
    {
        if (ch=='s'||ch=='S')
        System.out.println("\nSquare of "+num+" = "+(num*num));
        else
        System.out.println("\nCube of "+num+" = "+(num*num*num));
    }
    void num_calc(int a,int b,char ch)
    {
        if (ch=='p'||ch=='P')
        System.out.println("\nProduct of "+a+" and "+b+" = "+(a*b));
        else
        System.out.println("\nSum of "+a+" and "+b+" = "+(a+b));
    }
    void num_calc(String s1,String s2)
    {
        if (s1.equalsIgnoreCase(s2))
        System.out.println("The string arguments are EQUAL.");
        else
        System.out.println("The string arguments are NOT EQUAL !!");
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        char choice;
        OverloadNumCalc obj = new OverloadNumCalc();
        System.out.println("Enter an integer:");
        int n=sc.nextInt();
        System.out.println("Press 's' or 'S' to find its square.");
        System.out.println("Press any other thing to find its cube.");
        System.out.println("\nEnter your choice:");
        choice=sc.next().charAt(0);
        obj.num_calc(n,choice);
        System.out.println("\nEnter two integers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("\nPress 'p' or 'P' to find their product.");
        System.out.println("Press any other thing to find their sum.");
        System.out.println("\nEnter your choice:");
        choice=sc.next().charAt(0);
        obj.num_calc(x,y,choice);
        System.out.println("\nEnter two strings to check whether\nthey are equal or not:");
        String r=sc.nextLine();
        String s=sc1.nextLine();
        obj.num_calc(r,s);
    }
}