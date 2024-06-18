/**WAP to overload a function find() as follows:
 * I) boolean find(int n)
 * In it, find whether the input number is present
 * in the fibonacci series.
 * II) boolean  find(String s)
 * In it, find the largest word in the input string.
 * III) boolean find(String s,char ch)
 * In it, find the frequency of ch.
 * IV) boolean find(int a,int b)
 * In it, find the gcd of the two input numbers.
 */
import java.util.*;
class Overload_Find
{
    Boolean find(int n)
    {
        int a=0,b=1,s=0;
        while(s<n)
        {
            s=a+b;
            a=b;
            b=s;
        }
        if (s==n)
        return true;
        else
        return false;
    }
    String find(String s)
    {
        s=s.trim();
        s=s+" ";
        String str="",longest="";
        int max=0,cnt=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)!=' ')
            {
                cnt++;
                str=str+s.charAt(i);
            }
            else
            {
                if (cnt>=max)
                {
                    max=cnt;
                    longest=str;
                }
                cnt=0;
                str="";
            }
        }
        return longest;
    }
    int find(String s,char ch)
    {
        int cnt=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==ch)
            cnt++;
        }
        return cnt;
    }
    int find(int a,int b)
    {
        int product=a*b;
        int gcd=0;
        for (int i=1;i<b;i++)
        {
            if (a%i==0 && b%i==0)
            gcd=i;
        }
        return gcd;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Overload_Find obj=new Overload_Find();
        String words="";
        System.out.println("Press 1 to check if a number is present in the Fibonacci Series or not.");
        System.out.println("Press 2 to print the largest word in an input string.");
        System.out.println("Press 3 to find the frequency of a character in a string.");
        System.out.println("Press 4 to find the GCD of two input numbers.");
        System.out.println("\nEnter your choice:");
        int choice=sc.next().charAt(0);
        System.out.println(choice);
        switch(choice)
        {
            case 49: 
            System.out.println("Enter a number:-");
            int num=sc.nextInt();
            System.out.println();
            if (obj.find(num)==true)
            System.out.println(num+" is PRESENT in the Fibonacci Series.");
            else
            System.out.println(num+" is NOT PRESENT in the Fibonacci Series.");          
            break;
            case 50:
            System.out.println("Enter a string:-");
            words=sc.next();
            System.out.println("\nLongest word in this string : "+obj.find(words));
            break;
            case 51:
            System.out.println("Enter a string:-");
            words=sc.next();
            System.out.println("Enter the character to check its frequency in the string:-");
            char c=sc.next().charAt(0);
            System.out.println("\nFrequency of "+c+" in the given string : "+obj.find(words,c));
            break;
            case 52:
            System.out.println("Enter two numbers:-");
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println("\nGCD of "+x+" and "+y+" : "+obj.find(x,y));
            break;
            default:
            System.out.println("Wrong Choice Entered!!\nTry Again....");
        }
    }
}