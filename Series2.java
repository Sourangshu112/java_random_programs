import java.util.Scanner;
public class Series2
{
    public static void main()
    {
        Scanner ab = new Scanner(System.in);
        int n,i,a=10;
        System.out.println("Enter how many times the loop will run");
        n = ab.nextInt();
        for(i = 1 ; i <= n ; i++)
        {
            if(i % 2 == 0)
              System.out.print(i+" ");
            else
              System.out.print(a+" ");
            a = a + 10;
        }
    }
}