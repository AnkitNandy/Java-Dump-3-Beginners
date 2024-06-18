import java.util.*;
class Number_Of_Words
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s1=sc.nextLine();
        s1=s1.trim();
        s1=" "+s1;
        int num=s1.length();
        int cnt=0;
        for (int i=0;i<num;i++)
        {
            if (s1.charAt(i)==' ')
            cnt++;
        }
        System.out.println("Number of words = "+cnt);
    }
}
            