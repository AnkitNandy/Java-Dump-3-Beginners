class Pass_By_Value
{
    void display(int a,int b)
    {
        a=a+1;
        b=b+1;
        System.out.println("Formal Parameters : "+a+" and "+b);
    }
    public static void main()
    {
        int x=3,y=5;
        Pass_By_Value obj = new Pass_By_Value();
        obj.display(x,y);
        System.out.println("Actual Parameters : "+x+" and "+y);
    }
}