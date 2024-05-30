import java.util.Scanner;
public class SirtestQ5
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your three word name");
        String s = sc.nextLine();
        int n = s.length();
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == ' ')
               a = i+1;
        }
        String surname = s.substring(a);
        String initialname = s.substring(0,a-1);
        System.out.print("Your name is :- ");
        System.out.print(surname+" "+initialname);
    }
}