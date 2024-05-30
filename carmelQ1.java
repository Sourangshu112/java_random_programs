import java.util.Scanner;
public class carmelQ1
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[10];
        System.out.println("Enter 10 names of city");
        for(int i = 0; i < 10; i++)
           names[i] = sc.nextLine();
        System.out.println("Enter a names of city");     
        String s = sc.next()+sc.nextLine();
        int flag = 0,j;
        for(j = 0; j < 10; j++)
        {
            if ( s.equals(names[j]))
            {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Search successful "+names[j]);
        else
            System.out.println("Search unsuccessful. No such city in list");
    }
} 