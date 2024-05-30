import java.util.Scanner;
public class Question_5
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String s1 = sc.next();
        String s2 = sc.next();
        //uppercase
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        if(s1.equals(s2))
           System.out.println("They are equal");
        else if(s1.length()>s2.length())
           System.out.println(s1);
        else if(s2.length()>s1.length())
           System.out.println(s2);
        else
           System.out.println("The strings are of same size");
    }
}
    