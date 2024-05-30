import java.util.Scanner;
public class Prime
{
    public static void main()
    {
        int a,c=0;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        a = ob.nextInt();
        int i = 0;
        for(i = 2;i < a;i++)
        {
           c = a % i;
           if(c == 0)
           {
               System.out.println("It is not a prime number");
               break;
           }
        }
        if(c != 0)
           System.out.println("It is a prime number");
    }
}