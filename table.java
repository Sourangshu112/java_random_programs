import java.util.Scanner;
public class table
{
    public void main()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a =sc.nextInt();
        int i = 0;
        for(i = 1 ; i <= 10 ; i++)
        {
            int ans = a * i;
            System.out.println(a+" * "+i+" = "+ans);
        }
    }
}
    