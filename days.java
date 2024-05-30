import java.util.Scanner;
public class days
{
    public static void main()
    {
        int month,year,numdays = 0;
        Scanner key = new Scanner(System.in);
        System.out.println("Enter month(1-12)");
        month = key.nextInt();
        System.out.println("Enter year(yyyy)");
        year = key.nextInt();
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            numdays = 31; break;
            case 4:
            case 6:
            case 9:
            case 11:
            numdays = 30; break;
            case 2:
            if(((year % 4 == 0)&& !(year%100 == 0)) || (year%400==0))
               numdays = 29;
            else
               numdays = 28;
               break;
            default:
                System.out.println("Invalid month");
                break;
            }
            System.out.println("Number of days = "+numdays);
        }
    }