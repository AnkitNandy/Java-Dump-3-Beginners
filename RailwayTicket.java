/**Design a class RailwayTicket with
 * following description:
 * Instance variables/data members :
 * String name : To store the name of the customer
 * String coach : To store the type of coach
 * customer wants to travel
 * long mobno : To store customer's mobile number
 * int amt : To store basic amount of ticket
 * int totalamt : To store the amount to be paid after updating
 *                the original amount
 * 
 * Member Methods :-
 * void accept() - To take input for name, coach, mobile number
 *                 and amount.
 * void update() - To update the amount as per
 *                 the coach selected
 *                 (extra amount to be added to the
 *                 amount as follows)
 *                 
 *                 Type of Coaches            Amount
 *                 _________________________________
 *                    First_AC                  700
 *                    Second_AC                 500
 *                    Third_AC                  250
 *                    Sleeper                   None
 *                    
 * void display() - To display all the details of a customer such as
 *                  name, coach, total amount and mobile number.
 * Write a main method to create an object of the class and call the
 * above member methods.
 */
import java.util.*;
class RailwayTicket
{
    String name,coach;
    long mobno;
    int amt,totalamt;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the customer:");
        name=sc.next();
        System.out.println("Enter the type of coach to be travelled:");
        coach=sc.next();
        System.out.println("Enter the customer's mobile number:");
        mobno=sc.nextLong();
        System.out.println("Enter the basic amount of ticket:");
        amt=sc.nextInt();
    }
    void update()
    {
        if (coach.equalsIgnoreCase("First_Ac"))
        totalamt=amt+700;
        else if (coach.equalsIgnoreCase("Second_Ac"))
        totalamt=amt+500;
        else if (coach.equalsIgnoreCase("Third_Ac"))
        totalamt=amt+250;
        else
        totalamt=amt;
    }
    void display()
    {
        System.out.println("\nBILL");
        System.out.println("Name : "+name);
        System.out.println("Coach Type : "+coach);
        System.out.println("Mobile Number : "+mobno);
        System.out.println("Total Amount to be paid : Rs."+totalamt);
    }
    public static void main()
    {
        RailwayTicket obj=new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}