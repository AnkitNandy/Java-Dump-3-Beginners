//import java.util.*;
import java.io.*;
class Palindrome
{
    public static void main()throws IOException
    {
        //Scanner sc=new Scanner(System.in);
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integral number:-");
        //int num=sc.nextInt();
        int num=Integer.parseInt(sc.readLine());
        int rem,reverse=0;
        int n=num;
        while (num>0)
        {
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }
        if (reverse==n)
        System.out.println(n+" is a Palindrome.");
        else
        System.out.println(n+" is not a Palindrome.");
    }
}