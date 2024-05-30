import java.util.Scanner;
public class carmelQ6
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int n = s.length();
        int count = 0;
        s = s.toUpperCase();
        for(int i = 0; i < n-1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
              count++;
        }
        System.out.println("No. of double charater "+count);
    }
}