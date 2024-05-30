import java.util.Scanner;
public class SirtestQ4
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String s = sc.nextLine();
        char ch1,ch2=' ';
        ch1 = s.charAt(0);
        int n = s.length();
        for(int i = 1; i<n ;i++)
        {
            if (s.charAt(i) == ' ')
                ch2 = s.charAt(i+1);
        }
        System.out.println(ch1+" "+ch2);
    }
}