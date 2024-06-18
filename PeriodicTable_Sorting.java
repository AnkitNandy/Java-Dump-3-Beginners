/**WAP to store the names of any 10 elements of the
 * periodic table in a string type array along with 
 * their atomic number in  an integer array. Sort the
 * element in Ascending Order of their atomic number 
 * using any standard sorting technique and display
 * the names of elements along with their atomic number
 * after sorting.
 * 
 * INPUT : array1 = Ca    Fe    Li    Na (elements of periodic table)
 *         array2 = 20    26    3     11 (corresponding atomic number)
 * 
 * OUTPUT : Sorted elements with respect to their atomic number:-
 *          array1 = Li    Na    Ca    Fe
 *          array2 = 3     11    20    26
 */
import java.util.*;
class PeriodicTable_Sorting
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        String array1[] = new String[10];
        int array2[] = new int[10];
        for (int i=0;i<10;i++)
        {
            System.out.println("\nEnter an element of the periodic table:");
            array1[i] = sc.next();
            System.out.println("Enter its Atomic Number:");
            array2[i] = sc.nextInt();
        }
        int a=0;
        String b="";
        for (int i=9;i>=0;i--)
        {
            for (int j=0;j<i;j++)
            {
                if (array2[j+1]<array2[j])
                {
                    a = array2[j];
                    b = array1[j];
                    array2[j] = array2[j+1];
                    array1[j] = array1[j+1];
                    array2[j+1] = a;
                    array1[j+1] = b;
                }
            }
        }
        System.out.println("\nSorted elements with respect to their atomic no.:");
        System.out.print("array1 = ");
        for (int i=1;i<10;i++)
        System.out.print(array1[i]+"      ");
        System.out.println();
        System.out.print("array2 = ");
        for (int i=1;i<10;i++)
        System.out.print(array2[i]+"      ");
    }
} 