import java.util.*;
class RandomFrom1
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit till which you wish to generate");
        System.out.println("random numbers starting from 1(one) :-");
        int N=sc.nextInt();
        System.out.println("\nTen Random Numbers from 1 to "+N+" are :");
        for (int i=1;i<=10;i++)
        {
            System.out.println((int)(Math.random()*10)+1);
        }
    }
}
        