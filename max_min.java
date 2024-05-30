import java.util.Scanner;
public class max_min
{
    public static void main()
    {
        Scanner sou = new Scanner(System.in);
        int a,b,max,min;
        System.out.println("Enter 2 numbers");
        a = sou.nextInt();
        b = sou.nextInt();
        max = a > b ? a : b;
        min = a < b ? a : b;
        System.out.println("Maximun = "+max);
        System.out.println("Minimum = "+min);
    }
}
