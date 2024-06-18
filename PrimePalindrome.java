//Pg 438 -> Question 3 in Textbook
import java.util.*;
class PrimePalindrome
{
    int num,f,rev;
    PrimePalindrome(int n)
    {
        num=n;
        f=0;
        rev=0;
    }
    int prime()
    {
        int cnt=0;
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            cnt++;
        }
        if (cnt==2)
        {
            f=1;
            return(f);
        }
        else
        {
            return(f);
        }
    }
    int reverse()
    {
        int a=num,d=0;
        while (a!=0)
        {
            d=a%10;
            rev = rev*10+d;
            a = a/10;
        }
        return(rev);
    }
    void display()
    {
        if (num==rev && f==1)
        System.out.println("\n"+num+" IS A PRIME PALINDROME.");
        else
        System.out.println("\n"+num+" IS NOT  a Prime Palindrome!!");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int m=sc.nextInt();
        PrimePalindrome obj = new PrimePalindrome(m);
        obj.prime();
        obj.reverse();
        obj.display();
    }
}