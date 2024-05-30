import java.util.Scanner;
public class switchcase1
{
    public void main()
    {
        System.out.println("\f");
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your choice (1-7)");
        int choice = ob.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("Sunday");break;
            case 2 : System.out.println("Monday");break;
            case 3 : System.out.println("Tuesday");break;
            case 4 : System.out.println("Wednesday");break;
            case 5 : System.out.println("Thusday");break;
            case 6 : System.out.println("Friday");break;
            case 7 : System.out.println("Saturday");break;
            default : System.out.println("Wrong choice");break;
        }
    }
}
            