import java.util.Scanner;
public class Array1
{
    public void main()
    {
        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int i = 0, input ,sum = 0;
        for(i = 0 ; i <= 99 ; i++ )
        {
            System.out.print(i+") Enter a number : ");
            input = sc.nextInt();
            array[i] = input;
            sum = sum + array[i];
        }
        System.out.println("Sum of all numbers is = "+sum);
    }
}          