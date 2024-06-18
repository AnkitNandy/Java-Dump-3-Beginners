class Pass_By_Reference
{
    int display(int a)
    {
        a=a*5;
        return(a);
    }
    public static void main()
    {
        Pass_By_Reference obj=new Pass_By_Reference();
        int x=2;
        int p = obj.display(x);
        System.out.println("Actual Arguments before performing tasks : "+x);
        System.out.println("Values of ariables after performing tasks : "+p);
    }
}