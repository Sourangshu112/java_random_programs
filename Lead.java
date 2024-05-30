import java.util.Scanner;
public class Lead
{
    public static void main()
    {
        int a,b;
        int even = 0,odd = 0;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a multidigit number");
        a = abc.nextInt();
        while(a != 0)
        {
            b = a % 10;
            if(b % 2 == 0)
               even += b;
            else
               odd += b;
            a = a / 10;
        }
        if(even == odd)
           System.out.println("It is a Lead number");
        else
           System.out.println("It is not a Lead number");
    }
}