import java.util.Scanner;
public class pie
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points you want");
        long n = sc.nextLong();
        double withincircle = 0;
        double total = 0;
        for(long i = 0; i <= n; i++)
        {
            double x = Math.random( );
            double y = Math.random( );
            double dis = Math.pow((x*x  + y*y),0.5);
            if (dis <= 1)
             withincircle++;
            total++;
        }
        double pie = 4 * withincircle / total ;
        System.out.println("The value of pi "+pie);
    }
}