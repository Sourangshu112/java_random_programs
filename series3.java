import java.util.Scanner;
public class series3
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number the series continue");
        int z = sc.nextInt();
        int x = series(z);
        System.out.println("The sum of series is"+x);
    }
    public int series(int n)
    {
        int a=0,b=1,c=0,s=0;
        for(int i=1;c<=n;i++)
        {
            c=a+b; //1=0+1 
            b=c;   //b=2
            a=b;    //a=2
            s=s+c;   //1+2+
        }
        return s;
    }
}