/* Write a program in java to store 10 numbers (including positive and
 *negative numbers  in a single dimentional array and display all the negative
 *numbers followed by the positive numbers without changing the order.
 */
import java.util.Scanner;
public class arr3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        
        
        System.out.println("Enter 10 numbers");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)
            System.out.print(arr[i]+",");
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 0)
            System.out.print(arr[i]+",");
        }
        
    }
}