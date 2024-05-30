import java.util.Scanner;
public class Calculate
{
    public static void main()
    {
        Scanner qw = new Scanner(System.in);
        System.out.println("Enter a number");
        double K = qw.nextDouble();
        double W = (7*K+K*K)/2;
        System.out.println("The result is = "+W);
    }
}
