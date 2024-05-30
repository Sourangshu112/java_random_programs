import java.util.Scanner;
public class TestLeapyear
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit year(yyyy)");
        int year = sc.nextInt();
        if(year % 100 == 0)
        {
            if(year % 400 == 0)
              System.out.println("Year "+year+" is a leap year");
            else
              System.out.println("Year "+year+" is not a leap year");
        }
        else
        {
            if(year % 4 == 0)
              System.out.println("Year "+year+" is a leap year");
            else
              System.out.println("Year "+year+" is not a leap year");
        }
    }
}
