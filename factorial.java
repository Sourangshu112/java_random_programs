import java.util.Scanner;
public class factorial
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int fact = 1;
        int i = 0;
        for(i = 1 ; i <= num ; i++)
           fact *=i;
        System.out.println("Factorial of "+num+" is : "+fact);
    }
}
