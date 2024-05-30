import java.util.Scanner;
public class subject
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int total = 0;
        int i = 0;
        for(i = 1 ; i <= 5 ; i++)
        {
            System.out.println("Enter the marks of a subject");
            num = sc.nextInt();
            total += num;
        }
        System.out.println("Total marks of 5 subject is : "+total);
    }
}