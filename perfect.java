import java.util.Scanner;
public class perfect
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,i,b=0;
        System.out.println("enter a  number");
        a = sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
              b=b+i;
        }
        if(a==b)
          System.out.println("It is a perfect number");
        else
          System.out.println("It is not a perfect number");
        }
    }