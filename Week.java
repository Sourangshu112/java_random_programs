import java.util.Scanner;
public class Week
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day of week");
        int a = sc.nextInt();
        switch(a)
        {
            case 1:System.out.println("sunday"); break;
            case 2:System.out.println("Monday"); break;
            case 3:System.out.println("tuesday"); break;
            case 4:System.out.println("Wednesday"); break;
            case 5:System.out.println("Thusday"); break;
            case 6:System.out.println("Friday"); break;
            case 7:System.out.println("saturday"); break;
            default:System.out.println("Invalid day"); break;
        }
    }
}