import java.util.Scanner;
public class palindrome
{
    public static void main()
    {
        Scanner z = new Scanner(System.in);
        int a,b,c,r=0;
        System.out.println("enter a multidigit number");
        a = z.nextInt();
        c = a;
        while(a != 0)
        {
            b = a % 10;
            a = a / 10;
            r = r * 10 + b;
        }
        if(r == c)
           System.out.println("It is a Palindrome number");
        else
           System.out.println("It is not a Palindrome number");
    }
}