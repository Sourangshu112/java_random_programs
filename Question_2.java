import java.util.Scanner;
public class Question_2
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" number of numbers");
        for(int i=0 ; i<n ; i++)
            a[i]=sc.nextInt();
        //searching
        System.out.println("Enter the search element");
        int x = sc.nextInt();
        int flag = 0;
        for(int i=0 ; i<n ; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
           System.out.println("Element is present in the array");
        else
           System.out.println("No such element");
    }
}