import java.util.Scanner;
public class carmelQ4
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        System.out.println("Enter 20 numbers");
        for(int i = 0; i < 20; i++)
           a[i] = sc.nextInt();
        int flag = 0;
        for(int i = 0; i < 20; i++)
        {
            for(int j = 2; j < a[i]; j++)
            {
                if(a[i]%j == 0)
                {
                    flag =1;
                    break;
                }
            }
            if(flag == 0)
                   System.out.println(a[i]);
             flag = 0;
        }
    }
}
