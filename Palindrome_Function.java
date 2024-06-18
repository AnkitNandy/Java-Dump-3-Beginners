import java.util.*;
class Palindrome_Function
{
    int reverse(int n)
    {
        int rev=0,d=0;
        while (n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return(rev);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is Palindrome :");
        int num=sc.nextInt();
        Palindrome_Function obj = new Palindrome_Function();
        int r=obj.reverse(num);
        System.out.println();
        if (r==num)
        System.out.println(num+" IS A PALINDROME NUMBER.");
        else
        System.out.println(num+" IS NOT A PALINDROME NUMBER !!");
    }
}