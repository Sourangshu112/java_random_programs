import java.util.Scanner;
public class Date
{
    int day;
    int month;
    int year;
    Date()
    {
        day = 06;
        month = 05;
        year = 2006;
    }
    Date(int d,int m,int y)
    {
        day = d;
        month = m;
        year = y;
    }
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in terms of date, month and year");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Date ob1 = new Date();
        Date ob2 = new Date(a,b,c);
        System.out.println("The date in the system :- ");
        System.out.println("day- "+ob1.day+" month- "+ob1.month+" year- "+ob1.year);
        System.out.println("The date entered by the user :- ");
        System.out.println("day- "+ob2.day+" month- "+ob2.month+" year- "+ob2.year);
    }
}