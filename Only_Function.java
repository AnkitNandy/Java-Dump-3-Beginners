import java.util.*;
class Only_Function
{
    void calculate(int m,char ch)
    {
        if (ch=='s'||ch=='S')
        {
            if (m%7==0)
            System.out.println("Integer "+m+" is divisible by 7.");
            else
            System.out.println("Integer "+m+" is not divisible by 7!");
        }
        else
        {
            if (m%10==7)
            System.out.println("Last digit of integer "+m+" is 7.");
            else
            System.out.println("Last digit of integer "+m+" is not 7 at all!");
        }
    }
}
        