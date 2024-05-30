import java.util.Scanner;
public class tablesinput
{ 
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        System.out.println("Enter a number");
        double num = sc.nextDouble();
        int i = 0;
        for (i = 1;i <= 10;i++)
        {
            ans = num * i;
            System.out.println(num+" X "+i+" = "+ans);
        }
    }
}
