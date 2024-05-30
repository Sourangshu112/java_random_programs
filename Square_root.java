import java.util.Scanner;
//finding square root
public class Square_root
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double i,e=0;
        System.out.println("Enter a square number");
        double d = sc.nextDouble();
        for(i=0;i<=d;i++)
        {
            e = d/i;
            if (e==i)
            break;
        }
        System.out.println("Square root of "+d+" is = "+e);
    }
}   