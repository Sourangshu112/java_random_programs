import java. util.Scanner;
public class Series
{
    public static void main()
    {
        int a = 3;
        int i = 0;
        int n;
        Scanner qb = new Scanner(System.in);
        System.out.println("How many times the series will run");
        n = qb.nextInt();
        for(i=1;i<n;i++)
        {
            System.out.println(a+" ");
            a *= 2;
        }
    }
}