import java.util.Scanner;
public class Q9
{
    public void main()
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double a1 = Math.pow(a,1);
        double a2 = Math.pow(a,2);
        double a3 = Math.pow(a,3);
        double a4 = Math.pow(a,4);
        double a5 = Math.pow(a,5);
        System.out.println(a1+" , "+a2+" ,"+a3+" , "+a4+" , "+a5);
    }
}