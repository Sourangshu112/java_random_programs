import java.io.*;
public class palindrome_str
{
    public void main()
    {
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader stn = new BufferedReader(a);
        System.out.println("Enter a String");
        try{
            String str = stn.readLine();
            show(str);
        }
        catch(Exception e){}
        
    }
    public void show(String str)
    {
        if(test(str))
             System.out.println("It is a Palindrome");
        else if(test2(str))
             System.out.println("It is a Palindrome if you ignore case");
        else
             System.out.println("It is not a Palindrome");
    }
    public boolean test(String s)
    {
        StringBuffer rev =(new StringBuffer(s)).reverse();
        return s.equals(rev.toString());
    }
    public boolean test2(String s)
    {
        StringBuffer rev =(new StringBuffer(s)).reverse();
        return s.equalsIgnoreCase(rev.toString());
    }
}