import java.util.Scanner;
public class Nest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a number");
        a = sc.nextInt();
        while(a != 0)
        {
            b = a % 10;
            if(b==0)
            {
                System.out.println("it is a nest number");
                break;
            }
            a = a/10;
        }
        if(a == 0)
           System.out.println("It is not a nest number");
    }
}