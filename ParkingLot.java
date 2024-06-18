import java.util.*;
class ParkingLot
{
    int vno,hours;
    double bill;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vehicle number:");
        vno=sc.nextInt();
        System.out.println("Enter the number of hours the vehicle is parked in the parking lot:");
        hours=sc.nextInt();
    }
    void calculate()
    {
        bill = 3 + (1.50*(hours-1));
    }
    void display()
    {
        System.out.println("\n\nTHE BILL AMOUNT IS RS. "+bill);
    }
    static void main()
    {
        ParkingLot obj=new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}