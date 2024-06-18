class Pure_Function
{
    int display(int a)
    {
        a=a*5;
        return(a);
    }
    public static void main()
    {
        Pure_Function obj=new Pure_Function();
        int x=2;
        int p = obj.display(x);
        System.out.println("Actual Arguments before performing tasks : "+x);
        System.out.println("Values of variables after performing tasks : "+p);
    }
}