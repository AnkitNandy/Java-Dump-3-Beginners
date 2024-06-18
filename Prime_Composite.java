/*To accept an integral number
 * and check whether the number entered
 * is a prime or a composite number.
 */
import java.util.*;

public class Prime_Composite
{
 public static void main() 
 {
     
  int i;
  int n;
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter a number to check Prime or Composite ");
  n = sc.nextInt();
  
  if (n == 0 || n == 1)
   System.out.println(n +" is neither Prime nor Composite" );

  for (i = 2; i <= n - 1; i++) 
  {
   if (n % i == 0) 
   {
    System.out.println(n +"  is Composite number" );
    break;
   }
  }
  if (n == i)
   System.out.println(n +"  is Prime number " );
  
 }
}