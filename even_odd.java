import java.util.Scanner;
public class even_odd
{
    public void main()
    {
       int i = 0;
       for (i = 1;i <= 15;i++)
       {
           if (i % 2 != 0)
             System.out.println(i+" is a odd number.");
           else
             System.out.println(i+" is a even number.");
       }
    }
}
