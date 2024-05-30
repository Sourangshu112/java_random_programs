import java.util.Scanner;
public class Digits
{
    public static void main()
    {
        Scanner ab = new Scanner(System.in);
        int a,b,p=1;
        System.out.println("Enter a multidigit number");
        a = ab.nextInt();
        while(a != 0)
        {
            b = a % 10;
            a = a / 10;
            p = p * b;
        }
        System.out.println("product of Digits is "+p);
    }
}