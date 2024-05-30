import java.util.Scanner;
public class carmelQ5
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        s = " "+s;
        int n = s.length();
        int l = 0,temp = n;
        String h = "";
        for(int i = n-1; i>=0 ;i-- )
        {
            if(s.charAt(i) == ' ')
            {
                h = h+" "+s.substring(i,temp);
                temp = i;
            }
        }
        System.out.println(h);
    }
}