import java.util.Scanner;
public class Question_4
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        double d[] = new double[20];
        System.out.println("Enter 20 decimal values");
        for(int i=0;i<20;i++)
           d[i]=sc.nextDouble();
        //sum
        double sum = 0;
        for(int i=0;i<20;i++)
           sum =sum+d[i];
        System.out.println("The sum is"+sum);
        //highest
        double high = d[0];
        for(int i=0;i<20;i++)
        {
            if(high<d[i])
             high = d[i];
        }
        System.out.println(high);
    }
}